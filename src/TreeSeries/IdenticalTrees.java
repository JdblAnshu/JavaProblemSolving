public class IdenticalTrees {
	//Check if two trees are identical or not : https://leetcode.com/problems/same-tree/description/
	/*
	class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && (p.val == q.val)){
            return true;
        }

        return false;


    }
	 */
}
