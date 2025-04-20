package FinalSheet;

public class GraphAdjMatRepresentation {
	int[][] adjMatrix;
	int vertices;

	public GraphAdjMatRepresentation(int vertices) {
		this.vertices = vertices;
		adjMatrix = new int[vertices][vertices];
	}

	void addEdge(int src, int dest) {
		adjMatrix[src][dest] = 1; // For directed graph
		adjMatrix[dest][src] = 1; // Uncomment for undirected graph
	}

	void display() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GraphAdjMatRepresentation graph = new GraphAdjMatRepresentation(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.display();
	}
}
