package TODO;

import java.util.*;
//https://takeuforward.org/data-structure/topological-sort-using-dfs/%201%202
class TopologicSort {

	static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
		vis[node] = 1;
		for(Integer it: adj.get(node)) {
			if(vis[it] == 0) {
				findTopoSort(it, vis, adj, st);
			}
		}
		st.push(node);
	}
	static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
		Stack<Integer> st = new Stack<Integer>();
		int vis[] = new int[N];

		for(int i = 0;i<N;i++) {
			if(vis[i] == 0) {
				findTopoSort(i, vis, adj, st);
			}
		}

		int topo[] = new int[N];
		int ind = 0;
		while(!st.isEmpty()) {
			topo[ind++] = st.pop();
		}
		// for(int i = 0;i<N;i++) System.out.println(topo[i] + " ");
		return topo;
	}
	public static void main(String args[])
	{
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

// https://takeuforward.org/data-structure/topological-sort-bfs/
// https://www.geeksforgeeks.org/problems/topological-sort/1
//public class TopologicSort {
//}
/* using BFS
class Solution
{

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

    //Function to return list containing vertices in Topological order.

 }
 */


/* using DFS

class Solution
{
    //Function to return list containing vertices in Topological order.
        static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = 1;
        for(Integer it: adj.get(node)) {
            if(vis[it] == 0) {
                findTopoSort(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> st = new Stack<Integer>();
        int vis[] = new int[N];

        for(int i = 0;i<N;i++) {
            if(vis[i] == 0) {
                findTopoSort(i, vis, adj, st);
            }
        }

        int topo[] = new int[N];
        int ind = 0;
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        // for(int i = 0;i<N;i++) System.out.println(topo[i] + " ");
        return topo;
    }
}
 */