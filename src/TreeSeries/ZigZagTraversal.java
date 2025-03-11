public class ZigZagTraversal {
//ZigZag Traversal (https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
	/*
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    // if null then return

    List<List<Integer>> list = new ArrayList<>();
    if (root == null) {
    return list;
    }

    // declare two stacks
    Stack<TreeNode> currentLevel = new Stack<>();
    Stack<TreeNode> nextLevel = new Stack<>();

    // push the root
    currentLevel.push(root);
    boolean leftToRight = true;
    List<Integer> levelElements = new ArrayList<>();

    // check if stack is empty
    while (!currentLevel.isEmpty()) {


    // pop out of stack
    TreeNode node = currentLevel.pop();

    // print the data in it
    levelElements.add(node.val);

    // store data according to current
    // order.
    if (leftToRight) {
        if (node.left != null) {
        nextLevel.push(node.left);
        }

        if (node.right != null) {
        nextLevel.push(node.right);
        }
    }
    else {
        if (node.right != null) {
        nextLevel.push(node.right);
        }

        if (node.left != null) {
        nextLevel.push(node.left);
        }
    }

    if (currentLevel.isEmpty()) {
        list.add(levelElements);
        levelElements = new ArrayList<>();
        leftToRight = !leftToRight;
        //making nextLevel as new current level to process.
        currentLevel = nextLevel;
        nextLevel = new Stack<>();
    }
    }

    return list;

    }
	 */
}
