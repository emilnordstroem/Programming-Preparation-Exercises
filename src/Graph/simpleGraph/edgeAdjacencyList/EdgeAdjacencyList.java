package Graph.simpleGraph.edgeAdjacencyList;

import Graph.graphClasses.Graph;
import Graph.graphClasses.UnweightedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeAdjacencyList<V, E extends Edge<V>> implements Graph<V, E> {
    private Map<V, List<E>> adjacencyList;

    private Map<V, Integer> mapOfVertexIndexes;
    private List<V> orderedVertices;

    public EdgeAdjacencyList() {
        this.adjacencyList = new HashMap<>();
        this.mapOfVertexIndexes = new HashMap<>();
        this.orderedVertices = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return mapOfVertexIndexes.size();
    }

    @Override
    public List<V> getAdjacencyList() {
        return new ArrayList<>(orderedVertices);
    }

    @Override
    public V getVertex(int index) {
        return orderedVertices.get(index);
    }

    @Override
    public int getIndex(V v) {
        return orderedVertices.indexOf(v);
    }

    @Override
    public List<V> getNeighbors(int index) {
        List<V> neighbors = new ArrayList<>();

        if (getDegree(index) == 0) {
            return neighbors;
        }

        V vertex = orderedVertices.get(index);
        List<E> edges = adjacencyList.get(vertex);
        for (E edge : edges) {
            V source = edge.getV();
            V destination = edge.getU();
            if (source.equals(vertex)) {
                neighbors.add(destination);
            } else {
                neighbors.add(destination);
            }
        }
        return neighbors;
    }

    @Override
    public int getDegree(int index) {
        V vertex = orderedVertices.get(index);
        return adjacencyList.get(vertex).size(); // size of edge list
    }

    @Override
    public List<E> getEdges(V v) {
        return new ArrayList<>(adjacencyList.get(v));
    }

    @Override
    public void printEdges() {
        adjacencyList.forEach((vertex, edge) -> {
            edge.forEach(currentEdge -> {
                if (currentEdge.getV().equals(vertex)) {
                    System.out.println(currentEdge.toString());
                }
            });
        });
    }

    @Override
    public void clear() {
        this.adjacencyList = new HashMap<>();
        this.mapOfVertexIndexes = new HashMap<>();
        this.orderedVertices = new ArrayList<>();
    }

    @Override
    public boolean addVertex(V v) {
        if (orderedVertices.contains(v)) {
            return false;
        }

        int nextAvailableIndex = mapOfVertexIndexes.size();

        adjacencyList.put(v, new ArrayList<>());
        mapOfVertexIndexes.put(v, nextAvailableIndex);
        orderedVertices.add(v);

        return true;
    }

    @Override
    public boolean addEdge(E e) {
        V sourceVertex = e.getV();
        V destinationVertex = e.getU();

        if (!adjacencyList.containsKey(sourceVertex)
                || !adjacencyList.containsKey(destinationVertex)) {
            return false;
        }

        adjacencyList.get(sourceVertex).add(e);
        adjacencyList.get(destinationVertex).add(e);

        return true;
    }

    @Override
    public boolean removeVertex(V v) {
        if (!adjacencyList.containsKey(v)) {
            return false;
        }

        int vertexIndex = getIndex(v);
        if (getDegree(vertexIndex) == 0) {
            List<E> connectedEdges = adjacencyList.get(v);
            connectedEdges.forEach(edge -> removeEdge(edge));
        }

        adjacencyList.remove(v);
        mapOfVertexIndexes.remove(v);
        orderedVertices.set(vertexIndex, null); // this is just temporary

        return true;
    }

    @Override
    public boolean removeEdge(E e) {
        V source = e.getV();
        V destination = e.getU();

        if (!adjacencyList.containsKey(source)
                || !adjacencyList.containsKey(destination)) {
            return false;
        }

        adjacencyList.get(source).remove(e);
        adjacencyList.get(destination).remove(e);

        return true;
    }

    @Override
    public UnweightedGraph<V, E>.SearchTree dfs(V v) {
        /*
        mark v as visited
        for each neighbor w of v
            if w is not visited
                call DFS(w) recursively
         */


        return null;
    }

    @Override
    public UnweightedGraph<V, E>.SearchTree bfs(V v) {
        /*
        enqueue v into the queue
        while the queue is not empty
            w = dequeue the first node from the queue
            add w to the list of visited nodes
            for each neighbor u of w
                if u is not visited and not already in the queue
                    enqueue u into the queue
         */

        return null;
    }

}