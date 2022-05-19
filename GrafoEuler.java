import java.util.ArrayList;

public class GrafoEuler {
    private ArrayList<Arista>[] adj;
    private boolean [] visADJ;
    private int recoEu[];
    private static int nodo = 6;
    private int numEdges;

    public static void main(String [] args) {
        GrafoEuler ham = new GrafoEuler();
        ham.run();
    }
    
    private void run() {
        adj = new ArrayList[nodo];
        for (int i =0;i<nodo;i++) {
            adj[i] = new ArrayList<>();
        }

        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(3, 2);
        addEdge(2, 1);
        addEdge(2, 4);
        addEdge(1, 5);
        addEdge(4, 5);

        visADJ = new boolean[nodo];
        recoEu  = new int [numEdges+1];       
        colorarios();        
    }

    public void addEdge(int o, int d){
        adj[o].add(new Arista(d));
        adj[d].add(new Arista(o));
        numEdges++;
    }

    public void colorarios(){
        if(verificarImpar() < 3){
            for(int i=0;i<adj.length;i++){
                recoEu[0] = i;
                Arista arista = adj[i].get(0);
                recorrido(i,1,arista);
            }             
        }
    }

    public int verificarImpar(){
        int res = 0;
        for(int i=0;i<adj.length;i++){
            int a  = adj[i].size();
            if(adj[i].size()%2 != 0)
                res ++;
        }
        return res;
    }

    public void recorrido(int v, int destino, Arista arista) {
        if(numEdges+1==destino) {
            int ini = recoEu[0];
            int fin = recoEu[numEdges];
            if(ini == fin){
                System.out.print("Es ciclo de Euler: ");
            }else{
                System.out.print("Es camino de Euler: ");
            }
            for(int x : recoEu){
                System.out.print(x+ " ");        
            }
            System.out.println("");
            arista.setVisitado(false);
            return;
        }
        for (Arista a : adj[v]) {
            if(!a.getVisitado()) {
                a.setVisitado(true);
                Arista aux = obtenerArista(a.getDestino(),v);
                aux.setVisitado(true);
                recoEu[destino] = a.getDestino();
                recorrido(a.getDestino(),destino+1,a);
            }
        }
        arista.setVisitado(false);
    }
    
    private Arista obtenerArista(int origen, int buscado){
        Arista res = new Arista(-1);
        for(Arista a: adj[origen]){
            if(a.getDestino() == buscado)
                res = a;
        }
        return res;
    }
    
    public class Arista{
        private int destino;
        private boolean visitado;

        public Arista(int destino){
            this.destino = destino;
            visitado = false;
        }

        public int getDestino(){
            return destino;
        }

        public boolean getVisitado(){
            return visitado;
        }

        public void setVisitado(boolean cambio){
            visitado = cambio;
        }
    }
}
