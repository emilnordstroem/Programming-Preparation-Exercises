package Graph.egdeClasses;

// Primitive Edge class

public class SimpleEdge {
    private int v; // source vertex
    private int u; // destination vertex
    private double w; // weight

    public SimpleEdge(int v, int u, int w) {
        this.v = v;
        this.u = u;
        this.w = w;
    }

    public SimpleEdge(int v, int u) {
        this.v = v;
        this.u = u;
        this.w = 1.0;
    }

    public int getV() {
        return v;
    }

    public int getU() {
        return u;
    }

    public double getW() {
        return w;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setU(int u) {
        this.u = u;
    }

    public void setW(double w) {
        this.w = w;
    }
}
