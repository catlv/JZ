package topic1;

import java.util.Stack;

public class T_20_StackMin {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            stackMin.push(stackMin.peek() > node ? node : stackMin.peek());
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
