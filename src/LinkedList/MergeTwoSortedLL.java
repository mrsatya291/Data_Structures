package LinkedList;

public class MergeTwoSortedLL {

	public static void main(String[] args) {

		Node n5 = new Node(100, null);
		Node n4 = new Node(80, n5);
		Node n3 = new Node(60, n4);
		Node n2 = new Node(40, n3);
		Node n1 = new Node(10, n2);
		Node head1 = n1;
		Node m5 = new Node(190, null);
		Node m4 = new Node(90, m5);
		Node m3 = new Node(70, m4);
		Node m2 = new Node(30, m3);
		Node m1 = new Node(20, m2);
		Node head2 = m1;
		Node sortingHead = null;
		Node sortedList = mergeTwoSortedList(head1, head2, sortingHead);
		while (sortedList != null) {
			System.out.print(sortedList.data);
			sortedList = sortedList.next;
		}

	}

	private static Node mergeTwoSortedList(Node head1, Node head2,
			Node sortingHead) {
		Node newHead = null;
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		if (head1.data < head2.data) {
			sortingHead = head1;
			head1 = head1.next;
		} else {
			sortingHead = head2;
			head2 = head2.next;
		}
		newHead = sortingHead;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				sortingHead.next = head1;
				sortingHead = head1;
				head1 = sortingHead.next;
			} else {
				sortingHead.next = head2;
				sortingHead = head2;
				head2 = sortingHead.next;

			}
			if (head1 == null)
				sortingHead.next = head2;
			if (head2 == null)
				sortingHead.next = head1;

		}
		return newHead;

	}

}
