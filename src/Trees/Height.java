package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Height {
	public static void main(String arg[]) {
		Node n9=new Node(9,null,null);
		Node n8=new Node(8,null,null);
		Node n7=new Node(7,n8,n9);
		Node n6 = new Node(6, null, null);
		Node n5 = new Node(5, null, null);
		Node n4 = new Node(4, null, null);
		Node n3 = new Node(3, n6, n7);
		Node n2 = new Node(2, n4, n5);
		Node n1 = new Node(1, n2, n3);
		Node root = n1;
		Implementation it=new Implementation();
		DLLNode dl=new DLLNode(0);
		it.leftViewofTree(root, 0);
		
//		DLLNode dl1=it.findVerticalSum(root, dl);
//		while(dl1!=null)
//			{
//			System.out.println(dl1.data);
//			dl1=dl1.next;
//			}
		// System.out.println(findHeightofTree(root));
	//	printLevelOrderTraversal(root);
	}

	private static void printLevelOrderTraversal(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (q.isEmpty()) {
			Node curr = q.poll();
			System.out.println(curr.data);
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);

		}

	}

	public static int findHeightofTree(Node root) {
		if (root == null)
			return 0;

		int left = findHeightofTree(root.left);
		int right = findHeightofTree(root.right);
		if (left > right)
			return left + 1;
		else
			return right + 1;

	}

}
