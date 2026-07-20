import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);

        System.out.println("Minimum: " + ms.getMin());

        ms.pop();

        System.out.println("Top: " + ms.top());
        System.out.println("Minimum: " + ms.getMin());

        ms.pop();

        System.out.println("Minimum: " + ms.getMin());
    }
}