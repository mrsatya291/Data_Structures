package Trees;

public class MirrorImage {

	public static void main(String[] args) {
		//First Tree
		Node n9=new Node(9,null,null);
		Node n8=new Node(8,null,null);
		Node n7=new Node(7,n8,n9);
		Node n6 = new Node(6, null, null);
		Node n5 = new Node(5, null, null);
		Node n4 = new Node(4, null, null);
		Node n3 = new Node(3, n6, n7);
		Node n2 = new Node(2, n4, n5);
		Node n1 = new Node(1, n2, n3);
		Node root1 = n1;
		//Second Tree
		Node m9=new Node(9,null,null);
		Node m8=new Node(8,null,null);
		Node m7=new Node(7,m9,m8);
		Node m6 = new Node(6, null, null);
		Node m5 = new Node(5, null, null);
		Node m4 = new Node(4, null, null);
		Node m3 = new Node(3, m6, m7);
		Node m2 = new Node(2, m5, m4);
		Node m1 = new Node(1, m3, m2);
		Node root2 = m1;
		System.out.println(mirrorImage(root1,root2));

	}

	private static boolean mirrorImage(Node root1, Node root2) {
		if(root1==null && root2==null) return true;
		if(root1==null || root2==null) return false;
		
		return (root1.data==root2.data) && mirrorImage(root1.left, root2.right) && mirrorImage(root1.right, root2.left);
		
	}

}
