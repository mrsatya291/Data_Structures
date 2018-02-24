package Arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String... arg) {
		int ar[] = { 1,2,2,4,2,6,6,6,6 };
		int count = 0;
		int p = ar[0];
		System.out.println(ar.length);
		System.out.println(findDegreeofArray(ar));
		for (int i = 0; i < ar.length; i++) {
			

			if (p == ar[i])
				count++;

		}
		if (count >= 2)
			System.out.println(true);
		else System.out.println(false);
	}

	private static int findDegreeofArray(int[] ar) {
		int count=0;
		int degree=0;
		if(ar.length<=0) return 0;
		for(int i=0;i<ar.length-1;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]) count++; //1,2,2,4,2,6
			} if(count<2) count=0;
			else degree=count;
		}
		return degree;
		
	}
}
