
public class ReverseLinkedList {
	public static Node reverseLinkedList(Node head){
		Node curr = head;
		Node next = null;
		Node prev = null;

		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;

	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(7);

		Node temp = head;
		Node reversedHead = reverseLinkedList(head);

		while (reversedHead!=null){
			System.out.print(reversedHead.data + " ");
			reversedHead = reversedHead.next;
		}
	}

}
