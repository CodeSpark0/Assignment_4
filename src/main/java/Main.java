public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addEdge("A", "B", 4);
        graph.addEdge("A", "C", 2);
        graph.addEdge("C", "B", 1);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 8);
        graph.addEdge("D", "F", 3);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph, "A");

        System.out.println("BFS path from A to F:");
        for (Vertex<String> v : bfs.pathTo("F")) {
            System.out.print(v + " ");
        }
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph, "A");

        System.out.println("\nDijkstra path from A to F:");
        for (Vertex<String> v : dijkstra.pathTo("F")) {
            System.out.print(v + " ");
        }
        System.out.println("\nDistance from A to F: " + dijkstra.distanceTo("F"));
    }
}