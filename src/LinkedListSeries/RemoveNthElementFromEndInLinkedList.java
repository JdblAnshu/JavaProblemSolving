public class RemoveNthElementFromEndInLinkedList {


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
