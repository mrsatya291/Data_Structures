package Arrays;

public class Segretaion {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 7, 5, 4, 9, 8, 1, 12, 20, 11, 10 };
		int n = arr.length;
		
		for (int k = 0; k < n; k++) {
			segregateOddEven(arr);
			System.out.println(arr[k]);
		}
		
	}

	private static void segregateOddEven(int[] arr) {
		int n = arr.length;
	    int eve=0;
	    int odd=n-1;
	    while(eve<=odd)
	    switch (arr[eve]%2){
	    
	    case 0: eve++;
	    break;
	    case 1: swap(arr[eve],arr[odd]);
	  	    odd--;break;
	    
	    }
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = 0;
		temp = i;
		i = j;
		j = temp;

	}

}
