
/* Min Stack */
// constant time push, pop, top, getMin
public class Solution155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        System.out.println(minStack.getMin());
    }
}

class MinStack {
    Node top = null;

    public void push(int x) {
        Node newNode = new Node(top, x);

        this.top = newNode;
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        if (top != null)
            return top.minStackVal;
        else
            return -1;
    }

    private class Node {
        Node next;
        int val;
        int minStackVal;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
            this.minStackVal = val;

            if (next != null) {
                if (this.minStackVal > next.minStackVal) {
                    this.minStackVal = next.minStackVal;
                }
            }
        }
    }
}
