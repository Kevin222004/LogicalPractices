package leetcode;

import java.util.Stack;

public class Prob151 {
    public static void main(String[] args) {
        Solution151 sol = new Solution151();
        System.out.println(sol.reverseWords("the sky is               blue"));
    }
}
class Solution151 {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        Stack stack = new Stack();
        s = s.trim();
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!s.substring(temp, i).isBlank()) {
                    stack.push(s.substring(temp, i).trim());
                }
                temp = i + 1;
                while (s.charAt(i) != ' ') {
                    temp++;
                }
            } else if (i == s.length()-1) {
                stack.push(s.substring(temp, s.length()));
            }
        }

        while (!stack.isEmpty()) {
            str.append(stack.pop()).append(' ');
        }

        return str.toString().trim();
    }

}