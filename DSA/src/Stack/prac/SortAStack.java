/*
stack (ip) :- 7 -> 11 -> 3 -> 5 -> 9
sorted stack (op) :- 11 -> 9 -> 7 -> 5 -> 3

method :- using recurssion



*/

package Stack.prac;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> ip = new Stack<>();
        ip.add(7);ip.add(11);ip.add(3);ip.add(5);ip.add(9);
        System.out.println(ip);
        sortStack(ip);
        System.out.println(ip);
    }

    static void sortStack(Stack<Integer> ip) {
        if (ip.isEmpty()) {
            return;
        }
        int topElement = ip.peek();
        ip.pop();
        sortStack(ip);
        insertSorted(ip, topElement);
    }

    static void insertSorted(Stack<Integer> stack, int target) {
        if (stack.isEmpty()) {
            stack.push(target);
            return;
        }
        if (stack.peek() >= target) {
            stack.push(target);
            return;
        }

        int topElement = stack.peek();
        stack.pop();
        insertSorted(stack, target);
        stack.push(topElement);
    }
}
