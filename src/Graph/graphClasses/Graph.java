package Graph.graphClasses;

import java.util.List;

public interface Graph <V, E> {
    int getSize();

    List<V> getAdjacencyList();

    V getVertex(int index);
    int getIndex(V v);

    List<V> getNeighbors(int index);
    int getDegree(int index);
    void printEdges();

    void clear();

    boolean addVertex(V v);
    boolean addEdge(E e);

    boolean removeVertex(V v);
    boolean removeEdge (E e);

    // obtain inner SearchTree class from vertex object
    UnweightedGraph<V, E>.SearchTree dfs(int v);
    UnweightedGraph<V, E>.SearchTree bfs(int v);

}
