package Trees;

public class SumTree {

	public static void main(String[] args) {
		Node m9 = new Node(9, null, null);
		Node m8 = new Node(8, null, null);
		Node m7 = new Node(7, m9, m8);
		Node m6 = new Node(6, null, null);
		Node m5 = new Node(5, null, null);
		Node m4 = new Node(4, null, null);
		Node m3 = new Node(3, m6, m7);
		Node m2 = new Node(2, m5, m4);
		Node m1 = new Node(1, m3, m2);
		Node root2 = m1;
		SumTree(root2);
		printInOrderTree(root2);
		

	}

	private static void printInOrderTree(Node root) {
		if (root == null)
			return;
		printInOrderTree(root.left);
		System.out.print(root.data+" ");
		printInOrderTree(root.right);

	}

	public static int SumTree(Node root) {
		if (root == null)
			return 0;
		int value = root.data+SumTree(root.left) + SumTree(root.right);
		
		return value;

	}

}
