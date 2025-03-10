// Java program for level order traversal of Binary Tree
// Using Queue
import java.util.*;



class LevelOrderTraversal {
	// Iterative method to find height of Binary Tree
	static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return new ArrayList<>();

		// Create an empty queue for level order traversal
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		// Enqueue Root
		q.add(root);
		int currLevel = 0;

		while (!q.isEmpty()) {
			int len = q.size();
			res.add(new ArrayList<>());

			for (int i = 0; i < len; i++) {
				// Add front of queue and remove it from queue
				TreeNode TreeNode = q.poll();
				res.get(currLevel).add(TreeNode.data);

				// Enqueue left child
				if (TreeNode.left != null)
					q.add(TreeNode.left);

				// Enqueue right child
				if (TreeNode.right != null)
					q.add(TreeNode.right);
			}
			currLevel++;
		}
		return res;
	}

	public static void main(String[] args) {
		// Create binary tree
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(6);
		root.right.right.right = new TreeNode(5);

		// Perform level order traversal
		ArrayList<ArrayList<Integer>> res = levelOrder(root);

		// Print the result
		for (ArrayList<Integer> level : res)
			for (int data : level)
				System.out.print(data + " ");
	}
}

/*
//TRY LATER BELOW IS BETTER

public List<List<Integer>> levelOrder(TreeNode root) {
        // Create a list of lists to store levels
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            // If the tree is empty,
            // return an empty list
            return ans;
        }

        // Create a queue to store nodes
        // for level-order traversal
        Queue<TreeNode> q = new LinkedList<>();
        // Push the root node to the queue
        q.add(root);

        while (!q.isEmpty()) {
            // Get the size of the current level
            int size = q.size();
            // Create a list to store
            // nodes at the current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                // Get the front node in the queue
                TreeNode node = q.poll();
                // Store the node value
                // in the current level list
                level.add(node.val);

                // Enqueue the child nodes if they exist
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            // Store the current level
            // in the answer list
            ans.add(level);
        }
        // Return the level-order
        // traversal of the tree
        return ans;
    }
 */