package Trees;

public class DLLNode {
	public DLLNode(int temp) {
		// TODO Auto-generated constructor stub
		this.data=temp;
		this.previous=null;
		this.next=null;
	}
	public DLLNode(){
		this.data=0;
		this.previous=null;
		this.next=null;	
	}
	DLLNode previous=null;
	DLLNode next=null;
	int data=0;
	

}
