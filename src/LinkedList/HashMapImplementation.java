package LinkedList;

import java.util.HashMap;

public class HashMapImplementation {
	static HashMap<Integer,Node> ht=new HashMap<>();
	public static void main(String... arg){
		 Node n7=new Node(1,null);
	        Node n6=new Node(0,n7);
	        Node n5=new Node(2,n6);
			Node n4=new Node(3,n5);
			Node n3=new Node(8,n4);
			Node n2=new Node(9,n3);
			Node n1=new Node(7,n2);
			Node head=n1;
			ht.put(1,n1);
			ht.put(2,n2);
			ht.put(3,n3);
			ht.put(4,n4);
			ht.put(5,n5);
			ht.put(6,n6);
			ht.put(7,n7);
			System.out.println(ht.get(5).data);			
			
	}

	
}
