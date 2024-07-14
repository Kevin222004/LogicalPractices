package Stack.prac;

import java.util.Stack;

public class ValidParenthisis {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String paren = "]";
        System.out.println(solution.isValid(paren));
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if((c =='(') || c=='{' || c=='['){
                stack.add(c);
            }
            else {
                if(stack.isEmpty()){return false;}
                if((c==')' & stack.peek()!='(')) { return false;}
                if((c =='}'& stack.peek()!='{')) {return false;}
                if((c==']' & stack.peek()!='[')) {return false;}
                stack.pop();
            }

        }
        return !stack.contains('[') && !stack.contains('{') && !stack.contains('(');

    }
}