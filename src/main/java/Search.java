import java.util.*;

public abstract class Search<V> {
    protected WeightedGraph<V> graph;
    protected Vertex<V> source;
    protected Set<Vertex<V>> marked = new HashSet<>();
    protected Map<Vertex<V>, Vertex<V>> edgeTo = new HashMap<>();

    public Search(WeightedGraph<V> graph, V sourceData) {
        this.graph = graph;
        this.source = graph.getVertex(sourceData);
    }

    public boolean hasPathTo(V data) {
        Vertex<V> vertex = graph.getVertex(data);
        return vertex != null && marked.contains(vertex);
    }

    public Iterable<Vertex<V>> pathTo(V data) {
        Vertex<V> target = graph.getVertex(data);
        LinkedList<Vertex<V>> path = new LinkedList<>();

        if (target == null || !marked.contains(target)) {
            return path;
        }

        Vertex<V> current = target;

        while (current != null) {
            path.addFirst(current);

            if (current == source) {
                break;
            }

            current = edgeTo.get(current);
        }

        return path;
    }
}