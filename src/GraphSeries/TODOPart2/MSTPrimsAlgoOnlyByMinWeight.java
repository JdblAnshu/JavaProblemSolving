package TODOPart2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class MSTPrimsAlgoOnlyByMinWeight {
	static class Edge {
		int nbrNode, weight;

		Edge(int nbrNode, int weight) {
			this.nbrNode = nbrNode;
			this.weight = weight;
		}
	}

	public static void primMST(List<List<Edge>> graph, int nodes) {
		boolean[] visited = new boolean[nodes];  // Track visited nodes
		PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
		int totalWeight = 0;
		ArrayList<ArrayList<Integer>> mstEdges = new ArrayList<>();

		// Start with node 0
		pq.add(new Edge(0, 0));

		while (!pq.isEmpty()) {
			Edge minEdge = pq.poll();
			int currentNode = minEdge.nbrNode;

			// Skip if already visited
			if (visited[currentNode]) continue;

			// Mark node as visited
			visited[currentNode] = true;
			totalWeight += minEdge.weight;

			// Add its adjacent edges to the priority queue
			for (Edge neighbor : graph.get(currentNode)) {
				if (!visited[neighbor.nbrNode]) {
					pq.add(neighbor);
				}
			}
		}
		System.out.println("Minimum Spanning Tree Weight: " + totalWeight);



	}

	public static void main (String[] args){
		int nodes = 5;
		List<List<Edge>> graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(new ArrayList<>());
		}
		// Undirected Graph
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
