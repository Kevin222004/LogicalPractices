/*

Insert Top element AT bottom

again thru recursion

 */

package Stack.babbar;

import java.util.Stack;

public class InsertAtBottom {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(15);stack.push(24);stack.push(32);
        stack.push(11);
        insertAtBottom(stack, stack.peek());
        System.out.println(stack.lastElement());
        for (int i = 0; i < stack.capacity(); i++) {
            stack.pop();
        }
    }

    static void insertAtBottom(Stack<Integer> stack, int val) {
        if (stack.capacity()==0) {
            stack.push(val);
            return;
        }
        int currVal = stack.peek();
        stack.pop();
        insertAtBottom(stack, val);
        stack.push(currVal);
    }

}

