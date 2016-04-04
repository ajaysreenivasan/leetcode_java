import java.util.LinkedList;
import java.util.Queue;

/*
 *Implement the following operations of a stack using queues.
 *	push(x) -- Push element x onto stack.
 *	pop() -- Removes the element on top of the stack.
 *	top() -- Get the top element.
 *	empty() -- Return whether the stack is empty.
 */

public class Solution225 {
	Queue<Integer> queueOne = new LinkedList<>();
	Queue<Integer> queueTwo = new LinkedList<>();

	// Push element x onto stack.
	public void push(int x) {
		if (queueOne.isEmpty()) {
			queueOne.add(x);
			while (!queueTwo.isEmpty()) {
				queueOne.add(queueTwo.poll());
			}
		} else {
			queueTwo.add(x);
			while (!queueOne.isEmpty()) {
				queueTwo.add(queueOne.poll());
			}
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (queueOne.isEmpty()) {
			queueTwo.poll();
		} else {
			queueOne.poll();
		}
	}

	// Get the top element.
	public int top() {
		if (queueOne.isEmpty()) {
			return queueTwo.peek();
		} else {
			return queueOne.peek();
		}
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queueOne.isEmpty() && queueTwo.isEmpty();
	}
}
