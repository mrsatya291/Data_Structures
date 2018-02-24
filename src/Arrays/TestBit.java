package Arrays;

public class TestBit {
	
	static int n=-20;
	public static void main(String... arg){
       System.out.println(getTwosComplement(n));
       String ar=Integer.toString(n,2);
       System.out.println(ar);

       System.out.println(Integer.toBinaryString(n));
	}
	private static int getTwosComplement(int n) {
		int x=~n;
		
		
		
		return x;
		// TODO Auto-generated method stub
		
	}

}
