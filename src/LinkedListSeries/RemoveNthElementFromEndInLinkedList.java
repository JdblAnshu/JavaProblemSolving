public class RemoveNthElementFromEndInLinkedList {
//NOT COMPLETE SOLUTION

	public static void removeNthNodeFromEnd(Node head){

		int initialCnt = 1;
		Node temp = head;
		while (temp!=null && initialCnt != 4){
			System.out.print(temp.data + " ");
			temp = temp.next;
			initialCnt++;
		}

	}


	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(7);

		Node temp = head;
		//Node reversedHead = reverseLinkedList(head);
		removeNthNodeFromEnd(head);

//		while (temp!=null){
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
	}
}


/*
//Complete solution delete from end


// Java code for the deleting a node from end
// in two traversal

class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class GfG {
    static Node deleteNthNodeFromEnd(Node head, int n) {
        int k = 0;
        Node curr = head;

        // Find length of  list
        while (curr != null) {
            curr = curr.next;
            k++;
        }

        // if head is the nth node from end
        if (k - n == 0) return head.next;

        // Reach the node just before
        // the target node.
        curr = head;
        for (int i = 1; i < k - n; i++) {
            curr = curr.next;
        }

        // Skip the target node
        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteNthNodeFromEnd(head, 4);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
 */