public class SymmetricTree {
//Symmetric Tree : https://leetcode.com/problems/symmetric-tree/description/
//	//5 6  7 8    8 7 6 5
//	class Solution {
//		public boolean isSymmetric(TreeNode root) {
//			if (root == null) {
//				return true;
//			}
//			return isMirror(root.left, root.right);
//		}
//
//		private boolean isMirror(TreeNode node1, TreeNode node2) {
//			if (node1 == null && node2 == null) {
//				return true;
//			}
//			if (node1 == null || node2 == null) {
//				return false;
//			}
//			return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
//		}
//	}
}
