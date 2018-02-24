package Sorting;

public class MergeSort {
	public static void main(String... arg){
		int arr[]={3,11,6,1,0,23,12};
		mergeSort(arr);
	}

	private static int[] mergeSort(int[] arr) {
	       int mid[]=new int[arr.length/2];
	       int left[]=mergeSort(mid);
		
	}

}
