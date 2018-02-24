package LinkedList;

import java.util.LinkedList;
import java.util.*;

public class LL01 {

	
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Node n7=new Node(1,null);
        Node n6=new Node(0,n7);
        Node n5=new Node(2,n6);
		Node n4=new Node(3,n5);
		Node n3=new Node(8,n4);
		Node n2=new Node(9,n3);
		Node n1=new Node(7,n2);
		Node head=n1;
		 Node ptr1=head;
		 Node ptr2=head;
		while(ptr2.next!=null){
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
		}
		System.out.println(ptr1.data);
		
		
		List<Integer> lt=new LinkedList<>();
		
		
	}

}
