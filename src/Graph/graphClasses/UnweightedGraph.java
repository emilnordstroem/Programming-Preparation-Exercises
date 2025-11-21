package Graph.graphClasses;

import Graph.simpleGraph.edgeAdjacencyList.Edge;

import java.util.ArrayList;
import java.util.List;

public class UnweightedGraph <V, E> implements Graph<V, E> {
    private List<V> vertices;
    private List<List<E>> neighbors;

    public UnweightedGraph() {

    }

    public UnweightedGraph(V[] vertices, int[][] edges) {

    }

    public UnweightedGraph(List<V> vertices, List<E> neighbors) {

    }

    public UnweightedGraph(int[][] edges, int numberOfVertices) {

    }

    public UnweightedGraph(List<Edge<V>> edges, int numberOfVertices) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<V> getAdjacencyList() {
        return List.of();
    }

    @Override
    public V getVertex(int index) {
        return null;
    }

    @Override
    public int getIndex(V v) {
        return 0;
    }

    @Override
    public List<V> getNeighbors(int index) {
        return List.of();
    }

    @Override
    public int getDegree(int index) {
        return 0;
    }

    @Override
    public List<E> getEdges(V v) {
        return List.of();
    }

    @Override
    public void printEdges() {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addVertex(V v) {
        return false;
    }

    @Override
    public boolean addEdge(E e) {
        return false;
    }

    @Override
    public boolean removeVertex(V v) {
        return false;
    }

    @Override
    public boolean removeEdge(E e) {
        return false;
    }

    @Override
    public SearchTree dfs(V v) {
        return null;
    }

    @Override
    public SearchTree bfs(V v) {
        return null;
    }

    public class SearchTree {
        private int root; // tree root
        private int[] parent; // parent of each vertex
        private List<Integer> searchOrder; // store search order

        public SearchTree(int root, int[] parent, List<Integer> searchOrder) {
            this.root = root;
            this.parent = parent;
            this.searchOrder = searchOrder;
        }

        public int getRoot() {
            return root;
        }

        public int getParent(int v) {
            return parent[v];
        }

        public List<Integer> getSearchOrder() {
            return searchOrder;
        }

        public int getNumberOfVerticesFount() {
            return searchOrder.size();
        }

        public List<V> getPath(int index) {
            return new ArrayList<>();
        }

        public void printPath(int index) {

        }

        public void printTree() {

        }

    }

}
