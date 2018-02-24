package Stack;

public class Implement {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.a[st.top]);
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.push(1000));
		System.out.println(st.a[st.top]);
		
	
		
		
		

	}

}
