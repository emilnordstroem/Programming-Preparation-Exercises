package Graph.simpleGraph.edgeAdjacencyList;

public class Edge <V> {
    private V u; // source Vertex
    private V v; // destination Vertex
    private double w; // weight of Edge

    public Edge(V u, V v, double w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public Edge(V u, V v) {
        this.u = u;
        this.v = v;
        this.w = 1.0;
    }

    public V getU() {
        return u;
    }

    public V getV() {
        return v;
    }

    public double getW() {
        return w;
    }

    public void setU(V u) {
        this.u = u;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return String.format("Edge between %s and %s%nWeighted at %.1f%n",
                v.toString(),
                u.toString(),
                w
        );
    }
}
