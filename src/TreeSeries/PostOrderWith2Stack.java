public class PostOrderWith2Stack {



	//left right root

	//stk -> root, right , left
	//stk2 -> root, right , left


	/*
	public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        if(root == null)
            return list;

        s1.push(root);
        while(s1.size()>0){
          TreeNode node = s1.pop();
          s2.push(node.val);  //ORDER OF INSERTION IN S2 IS ROOT —> RIGHT —> LEFT since in s1 right is pushed last, it will be pushed to s2 before left child

            if(node.left !=null)
            s1.push(node.left);

            if(node.right !=null)
            s1.push(node.right);
        }

         while(s2.size()>0){
             list.add(s2.pop()); // SINCE ORDER OF INSERTION IS  ROOT —> RIGHT —> LEFT  WHEN WLL POP s2 HERE WE GET POST ORDER i.e left right root (order flips)
         }
    return list;
    }
	 */
}
