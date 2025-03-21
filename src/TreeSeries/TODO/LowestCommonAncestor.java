package TODO;

//Lowest Common Ancestor: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class LowestCommonAncestor {

	/*
	class Solution {
    // Here we are doing DFS search Algo
    // In the traversal where ever we get the p or q we return it,
    //while returnning for a node from left there can be a null or p or q,
    // if both left and right are not null means one will be p and other will be q
    // if left if null then right can be p or q
    // if right if null then left can be p or q
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //In the traversal where ever we get the p or q we return it , if we reach null then simply return(Base cases)
        if(root == p) return p;
        if(root == q) return q;
        if(root == null) return null;

        TreeNode left= lowestCommonAncestor(root.left, p , q);
        TreeNode right= lowestCommonAncestor(root.right, p , q);

        if(left!= null && right != null) return root; //if both left and right are not null means one will be p and other will be q

        if(left == null){ // if left if null then right can have p or q
            return right;
        }else{
            return left;    // right == null ,  if right if null then left can have p or q
        }

    }

    //ex 1
    //


}
	 */
}
