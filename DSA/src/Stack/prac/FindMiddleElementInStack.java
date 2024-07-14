/*

find the middle element in stac but remeber that you cannot dlete any other element of stack

*/
package Stack.prac;

import java.util.Stack;

public class FindMiddleElementInStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10); stack.push(9);
        stack.push(8); stack.push(101);
        stack.push(91);
        stack.push(7); stack.push(6);
        stack.push(5); stack.push(4);

        middleAtStack(stack, stack.capacity());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void middleAtStack(Stack<Integer> stack, int size) {
        if (stack.size() == size/2 ) {
            System.out.println(stack.peek());
            return;
        }
        int data = stack.pop();
        // recursive call
        middleAtStack(stack, size);
        // backtrack to add removed data during recursive
        stack.push(data);
    }
}
