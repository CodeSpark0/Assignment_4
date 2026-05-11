import java.util.*;

public class DijkstraSearch<V> extends Search<V> {
    private Map<Vertex<V>, Double> distTo = new HashMap<>();

    public DijkstraSearch(WeightedGraph<V> graph, V sourceData) {
        super(graph, sourceData);
        dijkstra();
    }

    private void dijkstra() {
        for (Vertex<V> v : graph.getVertices()) {
            distTo.put(v, Double.POSITIVE_INFINITY);
        }

        distTo.put(source, 0.0);

        PriorityQueue<Vertex<V>> queue = new PriorityQueue<>(
                (a, b) -> Double.compare(distTo.get(a), distTo.get(b))
        );

        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();

            if (marked.contains(current)) {
                continue;
            }

            marked.add(current);

            for (var entry : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                double distance = distTo.get(current) + weight;

                if (distance < distTo.get(neighbor)) {
                    distTo.put(neighbor, distance);
                    edgeTo.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
    }
    public double distanceTo(V data) {
        return distTo.getOrDefault(graph.getVertex(data), Double.POSITIVE_INFINITY);
    }
}