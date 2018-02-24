package Arrays;

public class DuplicateReadOnly {
	 static int nums[]={1,2,2,2,3,4,5};
	
	public static void main(String... arg){
		int n=nums.length;
		System.out.println(findDuplicate(nums));
		saperateEvenOdd(nums);
		
		
		
		
		
	}

	private static void saperateEvenOdd(int[] nums2) {
	
	int n=nums2.length;
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	if(nums2[i]%2==0){
		arr[i]=nums2[i];
		if(arr[i]<arr[i+1]) swap(arr[i],arr[i+1]);
	}else{ 
		arr[n-1]=nums2[i];
	}
	}}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=0;
		i=temp;
		temp=j;
		j=i;
	}

	private static int findDuplicate(int[] nums2) {
			        if(nums.length==0) return -1;
	        for(int i=0,j=nums.length-1;i>nums.length||j<0;i++,j--){
	            
	            if(nums[i]==nums[j]) System.out.println(nums[i]);
	           
	        }
			return 0;
			
	    }
	}


