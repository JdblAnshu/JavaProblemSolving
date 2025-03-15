package TODO;

//Top View of Binary Tree : https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
public class TopViewBinaryTree {


	/*
	    static class QueueObj {
        Node node;
        int hd;//hd is horizantal distance or vertical index

        QueueObj(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }

     static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int min = 0;
        int max = 0;
        // Level Order Traversal
        q.add(new QueueObj(root, 0));
        while (!q.isEmpty()) {
            QueueObj curr = q.poll();

            // only include in map if this is the
            // first node of this specific
            // horizontal distance
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            if (curr.node.left != null) {
                // min can be found only in left side due to
                // "-1" minimum horizontal distance of any
                // node from root
                min = Math.min(min, curr.hd - 1);
                q.add(new QueueObj(curr.node.left,
                                   curr.hd - 1));
            }

            if (curr.node.right != null) {
                // max can be found only in right side due
                // to "+1" maximum horizontal distance of
                // any node from root
                max = Math.max(max, curr.hd + 1);
                q.add(new QueueObj(curr.node.right,
                                   curr.hd + 1));
            }
        }

        // traversal of (horizontal distance from root)
        // minimum to maximum
        for (; min <= max; min++) {

            list.add(map.get(min));

        }

        return list;
    }

	 */
}
