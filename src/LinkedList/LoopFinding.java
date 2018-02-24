package LinkedList;

public class LoopFinding {
	@SuppressWarnings("null")
	public static void main(String... arg) {

		Node n8 = new Node(5, null);
		Node n7 = new Node(1, n8);
		Node n6 = new Node(0, n7);
		Node n5 = new Node(2, n6);
		Node n4 = new Node(3, n5);
		Node n3 = new Node(8, n4);
		Node n2 = new Node(9, n3);
		Node n1 = new Node(7, n2);
		// n8 = new Node(5, n3);
		Node head = n1;
		Node prev = null;

		// System.out.println(findCycle(head));
		reverseList(head, prev);
		while (prev != null) {
			System.out.println(prev.data);
		}

	}

	private static void reverseList(Node head, Node prev) {
		if (head == null)
			return;

		Node temp = head.next;
		head.next = prev;
		prev = head;
		head = temp;
		reverseList(head, prev);

	}

	private static boolean findCycle(Node head) {
		Node slowPtr, fastPtr;
		slowPtr = fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.get2ndNext();
			if (slowPtr == fastPtr)
				return true;
		}
		return false;
	}

}
