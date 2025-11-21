package Graph;

import Graph.graphAlgorithm.DjistrasAlgorithm;
import Graph.graphClasses.Graph;
import Graph.simpleGraph.edgeAdjacencyList.Edge;
import Graph.simpleGraph.edgeAdjacencyList.EdgeAdjacencyList;
import Graph.simpleGraph.edgeAdjacencyList.Vertex;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // These are unweighted
        EdgeAdjacencyList<Vertex, Edge<Vertex>> graph = new EdgeAdjacencyList<>();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);

        System.out.println("Size after Vertices added: " + graph.getSize());

        // These are default unweighted at 1.0
//        Edge<Vertex> ab = new Edge<>(a, b);
//        Edge<Vertex> ac = new Edge<>(a, c);
//        Edge<Vertex> bc = new Edge<>(b, c);
//        Edge<Vertex> cd = new Edge<>(c, d);
//        Edge<Vertex> da = new Edge<>(d, a);

        // These are weighted
        Edge<Vertex> ab = new Edge<>(a, b, 5);
        Edge<Vertex> ac = new Edge<>(a, c, 2);
        Edge<Vertex> bc = new Edge<>(b, c, 1);
        Edge<Vertex> cd = new Edge<>(c, d, 2);
        Edge<Vertex> da = new Edge<>(d, a, 3);

        graph.addEdge(ab);
        graph.addEdge(ac);
        graph.addEdge(bc);
        graph.addEdge(cd);
        graph.addEdge(da);

        System.out.println("Added edges (graph.print): ");
        graph.printEdges();

        // Djistras Algorithm for Shortest Path (least costly)
        DjistrasAlgorithm
                <
                    Graph<Vertex, Edge<Vertex>>,
                    Vertex,
                    Edge<Vertex>
                >
                leastCostlyPath = new DjistrasAlgorithm<>(graph);

        List<Edge<Vertex>> shortestPath = leastCostlyPath.shortestPath(a, c);
        System.out.println("Shortest path: " + shortestPath);
    }

}