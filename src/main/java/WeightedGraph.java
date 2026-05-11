import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertices = new HashMap<>();
    private boolean directed;

    public WeightedGraph() {
        this(false);
    }

    public WeightedGraph(boolean directed) {
        this.directed = directed;
    }

    public Vertex<V> addVertex(V data) {
        if (!vertices.containsKey(data)) {
            vertices.put(data, new Vertex<>(data));
        }

        return vertices.get(data);
    }

    public void addEdge(V sourceData, V destData, double weight) {
        Vertex<V> source = addVertex(sourceData);
        Vertex<V> dest = addVertex(destData);

        source.addAdjacentVertex(dest, weight);

        if (!directed) {
            dest.addAdjacentVertex(source, weight);
        }
    }

    public Vertex<V> getVertex(V data) {
        return vertices.get(data);
    }

    public Collection<Vertex<V>> getVertices() {
        return vertices.values();
    }
}