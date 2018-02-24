package LinkedList;

public class Node {
	Node next;
	int data=0;
	public Node getNext() {
		return next;
	}
	public Node get2ndNext(){
		return next.next;
	}
	public void setNext(Node head) {
		this.next = head;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	Node(){
		next=null;
		data=0;
	}
	public Node(int i, Node n) {
		next=n;
		data=i;
	}
	

}
