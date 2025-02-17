public class TreeHeightBalanced {

	public static boolean isBalanced(TreeNode root) {
		System.out.println("Print balanced " + checkBalanced(root));
		return checkBalanced(root)<0 ? false: true ;
	}

	public static int checkBalanced(TreeNode root){
		if(root==null){
			return 0;
		}
		int leftHeight = checkBalanced(root.left);
		int rightHeight = checkBalanced(root.right);

		System.out.println("Left height" + leftHeight + " --------- " + "Right height" + rightHeight);
		if(leftHeight<0 || rightHeight <0){
			return -1;
		}

		if(Math.abs(leftHeight - rightHeight ) >1)
			return -1;
		return  1 + Math.max(leftHeight,rightHeight);

	}


	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(isBalanced(root));

	}
}
