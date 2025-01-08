public class LinkedListBasicOperation {

	public static Node insertAtStart(Node head){
		Node temp = head;

		Node newNode = new Node(45);
		


	return head;
	}


	public static void printLinkedList(){

	}


	public static void insertAfterGivenNodeLinkedList(){

	}


	public static void insertBeforeGivenNodeLinkedList(){

	}



	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(7);

		Node temp = insertAtStart(head);


		while (temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}



}
