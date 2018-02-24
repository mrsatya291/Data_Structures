package Heap;

public class Heap {
	int type = 0;
	static int count = 0;
	int capacity = 0;
	public static int[] arr;

	public Heap(int capacity, int type) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.count = 0;
	}

	public Heap() {

	}

	public int Parent(int i) {
		if (i <= 0 || i < count)
			return -1;
		else
			return (i - 1) / 2;

	}

	public static int leftChild(int i) {
		int left = 2 * i + 1;
		if (left >= count)
			return -1;
		return left;
	}

	public static int rightChild(int i) {
		int right = 2 * i + 2;
		if (right >= count)
			return -1;
		return right;
	}

}
