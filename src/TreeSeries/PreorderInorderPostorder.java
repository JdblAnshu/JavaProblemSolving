import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreorderInorderPostorder {

	//INORDER -> LEFT ROOT RIGHT
	public static List<Integer> inOrder(TreeNode root, List<Integer> arr){

		// If the current node is null
		// (base case for recursion), return
		if (root == null) {
			return Collections.emptyList();
		}
		// Recursively traverse the left subtree
		inOrder(root.left, arr);
		// Push the current node's
		// value into the list
		arr.add(root.data);
		// Recursively traverse
		// the right subtree
		inOrder(root.right, arr);

		return arr;
	}

	//PREODER -> ROOT LEFT RIGHT
	public static List<Integer> preOrder(TreeNode root, List<Integer> arr){

		if(root == null){
			return null;
		}

		arr.add(root.data);
		preOrder(root.left,arr);
		preOrder(root.right,arr);

		return arr;
	}

	//POSTORDER -> LEFT RIGHT ROOT
	public void postOrder(){

	}



	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		List<Integer> inOrderList = new ArrayList<>();
		// Getting inorder traversal
		inOrder(root, inOrderList);

		// Displaying the inorder traversal result
		System.out.print("Inorder Traversal: ");
		// Output each value in the
		// inorder traversal result
		for (int val : inOrderList) {
			System.out.print(val + " ");
		}
		System.out.println();

		List<Integer> preOrderList = new ArrayList<>();
		// Getting Preorder traversal
		preOrder(root, preOrderList);

		// Displaying the Preorder traversal result
		System.out.print("Preorder Traversal: ");
		// Output each value in the
		// inorder traversal result
		for (int val : preOrderList) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

}
