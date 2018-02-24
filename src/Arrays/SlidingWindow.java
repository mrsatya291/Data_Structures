package Arrays;

public class SlidingWindow {

	public static void main(String arg[]) {
		int k = 3;

		int arr[] = {1,3,5,0,1,-1,8,1,0,9,3,2,4};
		int n = arr.length;
		findMax2(k, arr, n);
		System.out.println("-------------------");
		findMax(k, arr, n);
        
        
	//	System.out.println(findMaxSum(arr, k, n));
	}

	private static void findMax2(int k, int[] arr, int n) {
	      if(n<k) return;
	      int Max=0;
	      for(int i=0;i<k;i++){
	    	  Max=Math.max(Max, arr[i]);
	      }System.out.println(Max);
	      for(int i=k;i<n;i++){
	    	 Max=Math.max(Max, arr[i]);
	    	 System.out.println(Max);
	      }
	      
		
	}

	private static int findMaxSum(int[] arr, int k, int n) {
        // Initialize result
        int max_sum = Integer.MIN_VALUE ;
     
        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++)
        {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
     
            // Update result if required.
            max_sum = Math.max(current_sum , max_sum );
        }
     
        return max_sum;
    }
	 //complexity kn
	private static void findMax(int k, int arr[], int n) {
		int maxValue=Integer.MIN_VALUE;
		for(int i=0;i<n-k+1;i++){
			int max=0;
			for(int j=0;j<k;j++){
			max=Math.max(arr[i+j], max);	
			}System.out.println(max);
	}
}}
