package TODOPart2;

/*
When to use Prim’s Algorithm:
Dense Graphs: When the graph has a large number of edges (i.e., when the graph is dense), Prim’s algorithm is usually more efficient.
Graph Representation: Works well when the graph is represented with an adjacency matrix or when a priority queue is available to help manage the edges efficiently.
Advantages:
More efficient for dense graphs (many edges).
Simple to implement if you have a priority queue or adjacency matrix.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class MST2 {
	static class Edge {
		int target, weight;
		Edge(int target, int weight) {
			this.target = target;
			this.weight = weight;
		}
	}

static class NodeEdge implements Comparable<NodeEdge> {
		int node, parent, weight;
		NodeEdge(int node, int parent, int weight) {
			this.node = node;
			this.parent = parent;
			this.weight = weight;
		}

		@Override
		public int compareTo(NodeEdge other) {
			return Integer.compare(this.weight, other.weight);
		}
	}
	public static void primMST(List<List<Edge>> graph, int nodes) {
		boolean[] visited = new boolean[nodes];
		PriorityQueue<NodeEdge> pq = new PriorityQueue<>();
		List<String> mstEdges = new ArrayList<>();
		int totalWeight = 0;

		// Start with node 0
		pq.add(new NodeEdge(0, -1, 0));

		while (!pq.isEmpty()) {
			NodeEdge minEdge = pq.poll();
			int currentNode = minEdge.node;

			if (visited[currentNode]) continue;

			visited[currentNode] = true;
			totalWeight += minEdge.weight;

			// Ignore parent -1 since it's the starting node
			if (minEdge.parent != -1) {
				mstEdges.add(minEdge.parent + " - " + currentNode + " (" + minEdge.weight + ")");
			}

			for (Edge neighbor : graph.get(currentNode)) {
				if (!visited[neighbor.target]) {
					pq.add(new NodeEdge(neighbor.target, currentNode, neighbor.weight));
				}
			}
		}

		// Print MST edges and total weight
		System.out.println("Minimum Spanning Tree Edges:");
		for (String edge : mstEdges) {
			System.out.println(edge);
		}
		System.out.println("Total MST Weight: " + totalWeight);
	}
	public static void main(String[] args) {
		int nodes = 5;
		List<List<Edge>> graph = new ArrayList<>();

		for (int i = 0; i < nodes; i++) {
			graph.add(new ArrayList<>());
		}

		// Undirected Graph Representation
		graph.get(0).add(new Edge(1, 2));
		graph.get(1).add(new Edge(0, 2));

		graph.get(1).add(new Edge(2, 3));
		graph.get(2).add(new Edge(1, 3));

		graph.get(0).add(new Edge(3, 6));
		graph.get(3).add(new Edge(0, 6));

		graph.get(1).add(new Edge(3, 8));
		graph.get(3).add(new Edge(1, 8));

		graph.get(1).add(new Edge(4, 5));
		graph.get(4).add(new Edge(1, 5));

		graph.get(2).add(new Edge(4, 7));
		graph.get(4).add(new Edge(2, 7));

		primMST(graph, nodes);
	}
}
