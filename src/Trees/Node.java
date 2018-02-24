package Trees;

public class Node {
	public Node(int i, Node n1, Node n2) {
		// TODO Auto-generated constructor stub
		this.left=n1;
		this.right=n2;
		this.data=i;
	}
	Node left=null;
	Node right=null;
	int data=0;

}
