package FinalSheet;


import java.util.*;

// Class to represent a graph
class Graph {
	// A map to represent the adjacency list. Key is the vertex, value is the list of adjacent vertices.
	private Map<Integer, List<Integer>> adjacencyList;

	// Constructor to initialize the graph
	public Graph() {
		adjacencyList = new HashMap<>();
	}

//	// Add a vertex to the graph
//	public void addVertex(int vertex) {
//		adjacencyList.putIfAbsent(vertex, new ArrayList<>());
//	}

	// Add an edge to the graph (undirected graph in this case)
	public void addEdge(int vertex1, int vertex2) {
		adjacencyList.putIfAbsent(vertex1, new ArrayList<>());
		adjacencyList.putIfAbsent(vertex2, new ArrayList<>());

		adjacencyList.get(vertex1).add(vertex2);
		adjacencyList.get(vertex2).add(vertex1);
	}

	// Display the graph (for testing purposes)
	public void displayGraph() {
		for (int vertex : adjacencyList.keySet()) {
			System.out.print("Vertex " + vertex + " is connected to: ");
			for (int neighbor : adjacencyList.get(vertex)) {
				System.out.print(neighbor + " ");
			}
			System.out.println();
		}
	}

	// Get all adjacent vertices of a vertex
	public List<Integer> getAdjacentVertices(int vertex) {
		return adjacencyList.get(vertex);
	}
}

public class GraphAdjListRepresentation {
	public static void main(String[] args) {
		Graph graph = new Graph();

//		// Add vertices
//		graph.addVertex(1);
//		graph.addVertex(2);
//		graph.addVertex(3);
//		graph.addVertex(4);

		// Add edges (undirected)
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		// Display the graph
		graph.displayGraph();
	}
}
