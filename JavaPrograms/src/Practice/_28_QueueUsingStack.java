package Practice;

import java.util.Stack;

public class _28_QueueUsingStack {
	public static void main(String args[]) {
		_28_QueueUsingStack test = new _28_QueueUsingStack();
		test.enqueue(10);
		test.enqueue(50);
		test.enqueue(100);
		test.dequeue();
	}

	private Stack stack1 = new Stack<>();
	private Stack stack2 = new Stack<>();

	public void enqueue(int element) {
		stack1.push(element);
		System.out.println(element + " inserted");
	}

	public void dequeue() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		System.out.println(stack2.pop() + " removed");
	}

}
