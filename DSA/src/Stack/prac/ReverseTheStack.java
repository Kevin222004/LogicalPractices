package Stack.prac;

import java.util.Stack;

public class ReverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        printStack(stack);
        reverseStack(stack);
        printStack(stack);
    }

    static void printStack(Stack stack) {
        for (; !stack.isEmpty(); stack.pop()) {
            System.out.print(stack.peek() + " ");
        }
        System.out.println();
    }

    static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int element = stack.peek();
        stack.pop();

        reverseStack(stack);

        insertAtBottom(stack, element);
    }

    static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int Topelement = stack.peek();
        stack.pop();
        insertAtBottom(stack, element);
        stack.push(Topelement);
    }
}
