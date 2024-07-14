package Stack.prac;

import java.util.Stack;

public class ReverseTheStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String s = "Kevin";
        for (int i = 0 ; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        };
    }
}
