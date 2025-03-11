public class BalancedBinaryTree {

	/*
	    public boolean isBalanced(TreeNode root) {
       return checkBalanced(root)<0 ? false: true ;
    }

    public int checkBalanced(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = checkBalanced(root.left);
        int rightHeight = checkBalanced(root.right);
        if(leftHeight<0 || rightHeight <0){
            return -1;

        }

        if(Math.abs(leftHeight - rightHeight ) >1)
          return -1;
        return  1 + Math.max(leftHeight,rightHeight);

    }
	 */
}
