/*
In input an expression should be given to you and you
have to check wethwer their is useless bracket or not

for example :-
    (a+b) -> no useless braces
    ((a+b)) -> useless braces are their
    (()(a+b))

what can be the logic?
-> if the operator is been presented in between 2 braces then
it is not useless else useless

*/
package Stack.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveRedundantBracket {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String expression = "((a+b))";
        List<Character> operator = new ArrayList<>();
        boolean result = false;
        operator.add('+');operator.add('*');operator.add('/');operator.add('-');
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '('
                    || operator.contains(expression.charAt(i))) {
                stack.push(expression.charAt(i));
            }
            else if (expression.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    result = true;
                    break;
                }
                else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        System.out.println(result);
    }
}
