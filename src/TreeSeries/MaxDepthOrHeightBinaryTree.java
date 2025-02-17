public class MaxDepthOrHeightBinaryTree {


//	Given the root of a binary tree, return its maximum depth.
//	A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

	public static int maxDepthOfBinaryTree(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.max(maxDepthOfBinaryTree(root.left),maxDepthOfBinaryTree(root.right));
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println(maxDepthOfBinaryTree(root));




	}
}
