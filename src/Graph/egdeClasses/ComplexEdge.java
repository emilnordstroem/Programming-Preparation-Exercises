package Graph.egdeClasses;

// More complex Edge class using vertex class aggregation

public class ComplexEdge <V> {
    private V v; // source Vertex
    private V u; // destination Vertex
    private double w; // weight

    public ComplexEdge(V v, V u, double w) {
        this.v = v;
        this.u = u;
        this.w = w;
    }

    public ComplexEdge(V v, V u) {
        this.v = v;
        this.u = u;
        this.w = 1.0;
    }

    public V getV() {
        return v;
    }

    public V getU() {
        return u;
    }

    public double getW() {
        return w;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setU(V u) {
        this.u = u;
    }

    public void setW(double w) {
        this.w = w;
    }

}
