package Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int ar[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6 };
		// removeDuplicate(arr);
		removeDuplicate2(ar);
	

	void removeDuplicate2(int[] arr) {
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[n - 1];
		for (int k = 0; k <= j; k++)
			System.out.println(arr[k]);

	}

	}

	public static void removeDuplicate(int[] arr) {
		int temp[] = new int[arr.length];
		int j = 0, n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1])
				temp[j] = arr[i]; // {1,
			j++;
		}
		temp[j] = arr[n - 1];

		for (int k = 0; k < temp.length - 1; k++)
			System.out.println(temp[k]);

	}
	// without Using Extra Space

}
