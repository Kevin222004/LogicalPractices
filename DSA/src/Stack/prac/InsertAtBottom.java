/*

Insert Top element AT bottom

again thru recursion

 */

package Stack.prac;

import java.util.Stack;

public class InsertAtBottom {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(15);
        stack.push(24);
        stack.push(32);

        insertAtBottom(stack, 11);
        System.out.println(stack.lastElement());
        System.out.println("==========");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    static void insertAtBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int currVal = stack.peek();
        stack.pop();
        insertAtBottom(stack, val);
        stack.push(currVal);
    }

}

