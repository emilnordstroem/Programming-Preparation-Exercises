package Graph.simpleGraph.edgeAdjacencyList;

public class Vertex {
    private String identifier;

    public Vertex(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
