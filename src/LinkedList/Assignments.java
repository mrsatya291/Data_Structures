package LinkedList;

public class Assignments {

	public static void main(String[] args) {
		Node n7 = new Node(19, null);
		Node n6 = new Node(13, n7);
		Node n5 = new Node(11, n6);
		Node n4 = new Node(9, n5);
		Node n3 = new Node(7, n4);
		Node n2 = new Node(3, n3);
		Node n1 = new Node(1, n2);
		Node head = n1;
		int n = 4;
		Node p7 = new Node(12, null);
		Node p6 = new Node(10, p7);
		Node p5 = new Node(8, p6);
		Node p4 = new Node(6, p5);
		Node p3 = new Node(5, p4);
		Node p2 = new Node(4, p3);
		Node p1 = new Node(2, p2);
		Node head2 = p1;

		// find nth node from end
		System.out.println(findNthNode(head, n).data);
		System.out.println(findCycle(head));
		// sortLL(head);
		Node newList=mergeList(head, head2);
		while(newList.next!=null) System.out.println(newList.data);

	}

	private static Node mergeList(Node head, Node head2) {
		while(head.next!=null||head2.next!=null){
			if(head.data>head2.data) {
				Node temp=head2;
				head2.next=head;
				head=temp;
			} else{
				Node temp=head;
				head.next=head2;
				head2=temp;
			}
			
			head=head.next;
			head2=head2.next;
		}return head2;

	}

	private static void sortLL(Node head) {
		// TODO Auto-generated method stub
		int temp;
		Node ptr = head;
		while (ptr.next != null) {
			if (ptr.data > ptr.next.data) {
				temp = ptr.next.data;
				ptr.next.data = ptr.data;
				ptr.data = temp;

			}
			ptr = ptr.next;

		}
		while (head.next != null) {
			System.out.println(head.data);
			head = head.getNext();

		}

	}

	private static boolean findCycle(Node head) {
		Node fastPtr, slowPtr;
		fastPtr = head;
		slowPtr = head;
		while (fastPtr.getNext() != null && fastPtr.get2ndNext() != null) {
			fastPtr = fastPtr.get2ndNext();
			slowPtr = slowPtr.getNext();
		}
		if (fastPtr == slowPtr)
			return true;
		else
			return false;
	}

	private static Node findNthNode(Node head, int k) {
		int count = 0;
		Node ptr = head;
		if (head == null)
			return null;
		while (head.next != null) {
			count++;
			head = head.next;
		}
		int n = count - k;
		int i = 0;
		if (n > count || n < 0)
			return null;
		while (i != n) {
			ptr = ptr.next;
			i++;
		}
		return ptr;
	}

}
