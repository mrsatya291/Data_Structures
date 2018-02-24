package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
	static int maxLevel = 0;

	public static void main(String... arg) {

		// root-n1n2-n3n4-n5n6

		// Node n8=new Node(8,null,null);

		Node n6 = new Node(8, null, null);
		Node n5 = new Node(7, n6, null);
		Node n4 = new Node(5, null, null);
		Node n3 = new Node(4, null, null);
		Node n2 = new Node(3, null, n5);
		Node n1 = new Node(2, n3, n4);
		Node n9 = new Node(2, null, null);
		Node root = new Node(1, n1, n2);

		int x = findLevelofTree(root, 5);
		int s = sizeOfTree(root);
		// System.out.println(s);
//		leftViewofTree(root, 1);
//		int level = findLevel(root, 1, n9);
	//	System.out.println("Level of Given Node is :" + level);
		DLLNode dl=new DLLNode(0);
		
		
		DLLNode head=findVerticalSum(root, dl);
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
		
		
		

	}

	public static DLLNode findVerticalSum(Node root, DLLNode dl) {
		// TODO Auto-generated method stub
		int temp=0;
		if(root==null)
			return null;
		findVerticalSum(root.left, dl.previous);
		temp=temp+root.data;
		dl.previous=new DLLNode(temp);
		
		findVerticalSum(root.right, dl.next);
		temp=temp+root.data;
		dl.next=new DLLNode(temp);
		
		return dl;
		
	}

	public static int findLevel(Node root, int level, Node n) {
		if (root == null)
			return -1;
		if (root == n)
			return level;
		int left = findLevel(root.left, level + 1, n);
		if (left != 0)
			return left;
		int right = findLevel(root.right, level + 1, n);
		if (right != 0)
			return right;
		return -1;

	}

	public static void leftViewofTree(Node root, int level) {
		// Base condition
		if (root == null) {
			return;
		}

		if (maxLevel < level) {
			System.out.println(root.data + " ");
			maxLevel = level;
		}
		leftViewofTree(root.right, level + 1);
		leftViewofTree(root.left, level + 1);
		

	}

	public static int sizeOfTree(Node root) {
		if (root == null)
			return 0;
		int lh = sizeOfTree(root.left);
		int rh = sizeOfTree(root.right);
		return lh + rh + 1;

	}

	public static int findLevelofTree(Node root, int level) {
		if (root == null) {
			return 0;
		}
		if (root.data == level)
			return level++;
		level = findLevelofTree(root.left, level);
		if (level != 0)
			return level;
		level = findLevelofTree(root.right, level);
		if (level != 0)
			return level;
		return level;

	}

	public static int findSumTree(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return root.data;
		if (root.left != null && root.right == null)
			return root.left.data;
		if (root.left == null && root.right != null)
			return root.right.data;

		int l = findSumTree(root.left);
		int r = findSumTree(root.right);
		root.data = l + r;

		return root.data;
	}

}
