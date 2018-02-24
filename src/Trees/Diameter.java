package Trees;

public class Diameter {

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
		Node root = m1;

		System.out.println(diameterOfTree(root));

	}

	public static int diameterOfTree(Node root) {
		if (root == null)
			return 0;
		Height h = new Height();

		int lh = h.findHeightofTree(root.left);
		int rh = h.findHeightofTree(root.right);
		int lDia = diameterOfTree(root.left);
		int rDia = diameterOfTree(root.right);
		int max1 = Math.max(lDia, rDia);
		int max2 = lh + rh + 1;
		return Math.max(max1, max2);

	}

}
