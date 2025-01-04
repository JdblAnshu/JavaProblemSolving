public class FindLoopInLinkedList {


	public static boolean findLoopInLinkedList(Node head){
			Node slow = head;
			Node fast = head;
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;

				if (slow == fast) {
					return true;
				}
			}
		return false;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		//head.next = head;

		System.out.println(findLoopInLinkedList(head));
//
//		while (temp!=null){
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
	}
}
