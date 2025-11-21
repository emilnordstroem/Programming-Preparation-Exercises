package Graph.egdeClasses;

public class Main {

    public static void main(String[] args) {
        // Primitive Edge implementation
        SimpleEdge e = new SimpleEdge(1, 2);
        SimpleEdge f = new SimpleEdge(2,3);
        SimpleEdge g = new SimpleEdge(3,1);

        // More Complex Edge implementation
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
    }

}
