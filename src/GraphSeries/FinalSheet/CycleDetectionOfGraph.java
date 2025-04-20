package FinalSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class CycleDetectionOfGraph
{
	//for cycle kisi bhi vertex pe if we are able to reach and it is already visited and we did not reach from parent node it has cycle

	static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
								 boolean vis[], int parent[])
	{
		Queue<Node> q =  new LinkedList<>(); //BFS
		q.add(new Node(s, -1));
		vis[s] =true;

		// until the queue is empty
		while(!q.isEmpty())
		{
			// source node and its parent node
			int node = q.peek().child;
			int par = q.peek().parent;
			q.remove();

			// go to all the adjacent nodes
			for(Integer it: adj.get(node))
			{
				if(vis[it]==false)
				{
					q.add(new Node(it, node));
					vis[it] = true;
				}

				// if adjacent node is visited and is not its own parent node
				else if(par != it) return true;
			}
		}

		return false;
	}

	// function to detect cycle in an undirected graph
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
	{
		boolean vis[] = new boolean[V];
		Arrays.fill(vis,false);
		int parent[] = new int[V];
		Arrays.fill(parent,-1);

		for(int i=0;i<V;i++)
			if(vis[i]==false)
				if(checkForCycle(adj, i,vis, parent))
					return true;

		return false;
	}

	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			adj.add(new ArrayList < > ());
		}
		adj.get(1).add(2);
		adj.get(1).add(4);
		adj.get(4).add(1);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);
//		adj.get(4).add(3);
//		adj.get(3).add(4);

		CycleDetectionOfGraph obj = new CycleDetectionOfGraph();
		boolean ans = obj.isCycle(5, adj);
		if (ans)
			System.out.println("1");
		else
			System.out.println("0");
	}
}

class Node {
	int child;
	int parent;
	public Node(int first, int second) {
		this.child = first;
		this.parent = second;
	}
}


/*
private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>>
		adj) {
	vis[node] = 1;
	// go to all adjacent nodes
	for(int adjacentNode: adj.get(node)) {
		if(vis[adjacentNode]==0) {
			if(dfs(adjacentNode, node, vis, adj) == true)
				return true;
		}
		// if adjacent node is visited and is not its own parent node
		else if(adjacentNode != parent) return true;
	}
	return false;
}
// Function to detect cycle in an undirected graph.
public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
	int vis[] = new int[V];
	for(int i = 0;i<V;i++) {
		if(vis[i] == 0) {
			if(dfs(i, -1, vis, adj) == true) return true;
		}
	}
	return false;
}

main{
	isCycle();
}


 */