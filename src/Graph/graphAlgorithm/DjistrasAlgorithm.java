package Graph.graphAlgorithm;

import Graph.graphClasses.Graph;
import Graph.simpleGraph.edgeAdjacencyList.Edge;
import Graph.simpleGraph.edgeAdjacencyList.Vertex;

import java.lang.annotation.Target;
import java.util.*;

public class DjistrasAlgorithm
        <
                T extends Graph<V, E>,
                V extends Vertex,
                E extends Edge<V>
        >
{
    private T graph;

    public DjistrasAlgorithm(T graph) {
        this.graph = graph;
    }

    public List<E> shortestPath (V source, V destination) {
        Map<V, Double> distanceToDestinationMap = new HashMap<>();
        Map<V, E> previousVertexAndEdge = new HashMap<>();

        // initial distance
        for (V vertex : graph.getAdjacencyList()) {
            distanceToDestinationMap.put(vertex, Double.POSITIVE_INFINITY); // highest possible number
        }
        distanceToDestinationMap.put(source, 0.0); // destination to source is 0

        // Prioritized queue for optimal cost path
        PriorityQueue<V> priorityQueue = new PriorityQueue<>(
                Comparator.comparingDouble(
                        distanceToDestinationMap::get
                )
        );
        priorityQueue.add(source); // source of 0

        while (!priorityQueue.isEmpty()) {
            V currentVertex = priorityQueue.poll(); // get and remove head of queue
            if (currentVertex.equals(destination)) {
                break;
            }
            for (E edge : graph.getEdges(currentVertex)) {
                V vertexHub= edge.getU();
                // add the current double value in currentVertex with weight of current edge
                double newDistance = distanceToDestinationMap.get(currentVertex) + edge.getW();

                // if new Distance is lower than the already put in distance value
                // notice, the current value is default the highest possible value
                if (newDistance < distanceToDestinationMap.get(vertexHub)) {
                    distanceToDestinationMap.put(vertexHub, newDistance);
                    // the vertex and the edge we used to access this vertex
                    previousVertexAndEdge.put(vertexHub, edge);

                    // reset applying new priority
                    priorityQueue.remove(vertexHub);
                    priorityQueue.add(vertexHub);
                }
            }
        }

        if (!previousVertexAndEdge.containsKey(destination)) {
            // no path exists for this destination
            return List.of();
        }

        List<E> path = new ArrayList<>();
        V currentVertex = destination;

        while (!currentVertex.equals(source)) {
            E edge = previousVertexAndEdge.get(currentVertex);
            path.add(edge);
            currentVertex = edge.getV();
        }

        Collections.reverse(path);
        return path;
    }


}
