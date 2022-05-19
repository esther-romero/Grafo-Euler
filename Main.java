public class Main {
    public static void main(String [] args) {
        GrafoEuler euler = new GrafoEuler(4);

        euler.addEdge(0, 3);
        euler.addEdge(0, 3);
        euler.addEdge(0, 1);
        euler.addEdge(1, 3);
        euler.addEdge(1, 2);
        euler.addEdge(2, 3);
        euler.addEdge(2, 3);

        euler.colorarios();
    }
}

/*
        //Grafo 1
        nodos = 5
        
        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);

        ---------------------

        //Grafo 2
        nodos = 6

        euler.addEdge(0, 2);
        euler.addEdge(0, 3);
        euler.addEdge(3, 2);
        euler.addEdge(2, 1);
        euler.addEdge(2, 4);
        euler.addEdge(1, 5);
        euler.addEdge(4, 5);

*/