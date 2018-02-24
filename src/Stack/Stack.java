package Stack;

public class Stack {

	final int max = 1000;
	int top = -1;
	int a[] = new int[max];

	boolean push(int x) {
		if (top >= max) {
			System.out.println("Stack OverFlow");
			return false;
		} else {
			top = top + 1;
			a[top] = x;
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int x = a[top];
			top = top - 1;
			return x;
		}
	}

	Stack() {
		this.top = -1;
	}

	boolean isEmpty() {
		if (top < 0)
			return true;
		else
			return false;
	}

}
