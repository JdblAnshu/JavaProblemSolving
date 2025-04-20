public class 	LinkedListBasicOperation {
	//Done
	public static Node insertAtStart(Node head , int number) {

		Node newNode = new Node(number);
		if(head == null){
			return newNode;
		}

		newNode.next = head;
		return newNode;
	}


	public static void printLinkedList(Node head) {

		System.out.println("Inside printLinkedList: ");
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}


	public static void insertAfterGivenNodeLinkedList(Node head, int numToInsert) {
		Node curr = head;
		Node temp = null;

		while (curr!=null){
			if (curr.data==4)
				break;
			curr = curr.next;
		}

//		temp = curr.next;
//		curr.next = new Node(num);
//		curr.next.next = temp;

		//Alternate approach
		Node newNode = new Node(numToInsert);
		newNode.next = curr.next;
		curr.next = newNode;

		printLinkedList(head);



	}


	public static void insertBeforeGivenNodeLinkedList(Node head, int numToInsert) {

		Node curr = head;
		Node temp = null;

		while (curr!=null){
			if (curr.next.data==7)
				break;
			curr = curr.next;
		}

		Node newNode = new Node(numToInsert);
		newNode.next = curr.next;
		curr.next = newNode;

		printLinkedList(head);

	}

	public static void insertNodeAtGivenPositionLinkedList() {

	}


	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(7);

		//Node temp = insertAtStart(null,89);


		insertAfterGivenNodeLinkedList(head,456);

		insertBeforeGivenNodeLinkedList(head, 55);

	}


}
