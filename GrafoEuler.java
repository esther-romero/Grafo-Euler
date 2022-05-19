import java.util.ArrayList;

public class GrafoEuler {
    private ArrayList<Arista>[] adj;
    private boolean [] visADJ;
    private int recoEu[];
    private int nodo;
    private int numEdges;

    public GrafoEuler(int nodo){
        this.nodo = nodo;
        adj = new ArrayList[nodo];
        for (int i =0;i<nodo;i++) {
            adj[i] = new ArrayList<>();
        }
        visADJ = new boolean[nodo];
        
    }
    
    public void addEdge(int o, int d){
        adj[o].add(new Arista(d));
        adj[d].add(new Arista(o));
        numEdges++;
    }

    public void colorarios(){
        recoEu  = new int [numEdges+1];
        if(verificarImpar() < 3){
            for(int i=0;i<adj.length;i++){
                recoEu[0] = i;
                Arista arista = adj[i].get(0);
                recorrido(i,1,arista);
            }             
        }
    }

    private int verificarImpar(){
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
