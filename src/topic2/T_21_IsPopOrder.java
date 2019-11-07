package topic2;

/**
 * 思路：将 a 数组中的第一个元素压入栈中，然后判断栈的顶元素是否等于 b 数组的第一个元素，等于则栈弹出一个元素，然后再比较栈的新顶元素是否等于 b 数组的第二个元素；不等则继续从 a 数组弹出元素进入栈中。
 */
import java.util.Stack;

public class T_21_IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
