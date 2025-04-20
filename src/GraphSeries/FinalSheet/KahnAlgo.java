package FinalSheet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgo {
	//KahnAlgo is DAG topological sort using bfs
	// https://takeuforward.org/data-structure/topological-sort-bfs/
	// https://www.geeksforgeeks.org/problems/topological-sort/1
	//https://www.youtube.com/watch?v=XMiIk1B0v-w&t=229s
	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		int topo[] = new int[V];
		int indegree[] = new int[V];

		//finding indegree
		for(int i = 0;i<V;i++) {
			for(Integer it: adj.get(i)) {
				indegree[it]++;
			}
		}

		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0;i<V;i++) {
			//adding nodes to queue with indegree = 0
			if(indegree[i] == 0) {
				q.add(i);
			}
		}

		int ind=0;

		while(!q.isEmpty()) {
			Integer node = q.poll();
			topo[ind++] = node;
			//getting neighbour nodes of popped node and decreasing  their
			for(Integer it: adj.get(node)) {
				indegree[it]--;
				if(indegree[it] == 0) {
					q.add(it);
				}
			}
		}
		//printing topological ordering of nodes
		return topo;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		int n=6;
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> arr=new ArrayList<>();
			adj.add(arr);
		}

		adj.get(5).add(2);
		adj.get(5).add(0);
		adj.get(4).add(0);
		adj.get(4).add(1);
		adj.get(2).add(3);
		adj.get(3).add(1);

		int res[] = topoSort(6, adj);

		System.out.println("Toposort of the given graph is:" );
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
}
