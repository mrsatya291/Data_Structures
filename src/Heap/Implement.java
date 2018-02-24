package Heap;

public class Implement {

	private static int deleteMin(int[] arr1, int n) {
		// TODO Auto-generated method stub
		if (n <= 0)
			return -1;
		minHeap(arr1, n, 0);
		int temp = arr1[0];
		arr1[0] = arr1[n - 1];
		n--;
		minHeap(arr1, n, 0);
		return temp;
	}

	private static int[] findKSmallest(int[] arr1, int n, int k) {
		// Find kth smallest
		int arrK[] = new int[k];
		if (k <= 0)
			return null;
		while (k != 0) {
			int i = 0;
			arrK[i] = deleteMin(arr1, n);
			i++;
			k--;

		}
		return arrK;

	}

	private static void minHeap(int[] arr1, int n, int i) {
		int min = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr1[l] < arr1[i])
			min = l;
		if (r < n && arr1[r] < arr1[min])
			min = r;
		if (min != i) {
			int temp = arr1[i];
			arr1[i] = arr1[min];
			arr1[min] = temp;
			minHeap(arr1, n, min);
		}

	}

	public static void HeapSort(int arr1[]) {
		int n = arr1.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeap(arr1, n, i);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr1[0];
			arr1[0] = arr1[i];
			arr1[i] = temp;
			maxHeap(arr1, i, 0);

		}
	}

	private static void maxHeap(int[] arr1, int n, int i) {
		int max = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr1[l] > arr1[max])
			max = l;
		if (r < n && arr1[r] > arr1[max])
			max = r;
		if (max != i) {
			int temp = arr1[i];
			arr1[i] = arr1[max];
			arr1[max] = temp;
			maxHeap(arr1, n, max);
		}

	}

	public static void main(String... arr) {

		int arr1[] = { 6, 3, 5, 4, 2, 9,1,12,0,20,7 };
		int k = 5;

		Heap heap = new Heap(arr1.length, 0);

		int n = arr1.length;
		while (k != 0) {
			System.out.println(deleteMin(arr1, n));
			k--;
		}
		 // minHeap(arr1, n, 0);

		int[] arr2 = findKSmallest(arr1, n, 3);
//		for (int j = 0; j < arr2.length; j++) {
//
//			System.out.println(arr2[j]);
//		}

	}
}
