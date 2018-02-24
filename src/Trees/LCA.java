package Trees;

public class LCA {

	public static void main(String[] args) {
		Node n9 = new Node(9, null, null);
		Node n8 = new Node(8, null, null);
		Node n7 = new Node(7, n8, n9);
		Node n6 = new Node(6, null, null);
		Node n5 = new Node(5, null, null);
		Node n4 = new Node(4, null, null);
		Node n3 = new Node(3, n6, n7);
		Node n2 = new Node(2, n4, n5);
		Node n1 = new Node(1, n2, n3);
		Node root = n1;
		Node lca = findLCA(root, n5, n2);
		System.out.println(lca.data);

	}

	public static Node findLCA(Node root, Node n1, Node n2) {
		if (root == null)
			return null;
		if (root == n1 || root == n2)
			return root;
		Node left = findLCA(root.left, n1, n2);
		Node right = findLCA(root.right, n1, n2);
		if (left != null && right != null)
			return root;
		else {
			if(left==null)return right;
			return left;

		}

	}

}
