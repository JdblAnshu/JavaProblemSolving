// Java program for level order traversal of Binary Tree
// Using Queue
import java.util.*;

class TreeNode {
	int data;
	TreeNode left, right;

	// Constructor to initialize a new TreeNode
	TreeNode(int value) {
		data = value;
		left = null;
		right = null;
	}
}

class Solution {
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