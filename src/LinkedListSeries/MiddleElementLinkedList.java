


//In same package
//class Node{
//	int data;
//	Node next;
//	public Node(int num){
//		this.data = num;
//		this.next = null;
//
//	}
//}
public class MiddleElementLinkedList {

	public static void findMiddleNode(Node head){

		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}


			System.out.println("Middle element " + slow.data);


	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(7);

		Node temp = head;

		findMiddleNode(head);

		while (temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
