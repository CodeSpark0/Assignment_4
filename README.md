Вот готовый `README.md` для твоего **Assignment 4 - Graphs**:

````markdown
# Graph Search — BFS and Dijkstra Algorithm in Java

## 📌 About the project

This project is a beginner-friendly implementation of **Graphs** in Java.

The main goal of this assignment is to implement:

- **Breadth First Search (BFS)**
- **Dijkstra Shortest Path Algorithm**
- **Weighted Graph**
- **Vertex-based graph structure**

In this project, we do **not** use a separate `Edge` class.  
Instead, each `Vertex` stores its own adjacent vertices and edge weights.

---

## 🎯 Goal of the assignment

In lecture examples, the graph used an `Edge` class.

In this assignment, we remove the `Edge` class and create a `Vertex` class instead.

Each vertex stores:

```java
Map<Vertex<V>, Double> adjacentVertices;
````

This means:

```text
neighbor vertex -> weight
```

Example:

```text
A -> B with weight 4
A -> C with weight 2
```

---

## ⚙️ Implemented Algorithms

### 🔎 Breadth First Search

BFS is used to find a path from one vertex to another.

Important:

```text
BFS does not use weights.
BFS works by visiting vertices level by level.
```

---

### 📍 Dijkstra Algorithm

Dijkstra is used to find the shortest path in a weighted graph.

Important:

```text
Dijkstra uses edge weights.
It finds the path with the smallest total distance.
```

---

## 📂 Project Structure

```text
📂 src
└── 📂 main
    └── 📂 java
        ├── Vertex.java
        ├── WeightedGraph.java
        ├── Search.java
        ├── BreadthFirstSearch.java
        ├── DijkstraSearch.java
        └── Main.java
```
---

### Main.java

Contains example usage of the graph, BFS, and Dijkstra.

Example graph:

```java
graph.addEdge("A", "B", 4);
graph.addEdge("A", "C", 2);
graph.addEdge("C", "B", 1);
graph.addEdge("B", "D", 5);
graph.addEdge("C", "D", 8);
graph.addEdge("D", "F", 3);
```

---

## ▶️ Example Output

```text
BFS path from A to F:
A B D F

Dijkstra path from A to F:
A C B D F

Distance from A to F: 11.0
```

## 📌 Contributors

📌 **Team Members**:

* [Alikhan](https://github.com/CodeSpark0)
