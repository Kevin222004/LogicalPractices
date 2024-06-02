/*
Problem :- 17. Letter Combinations of a Phone Number

 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob17 {
    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        System.out.println(sol.letterCombinations("23"));
    }
}

class Solution17 {
    public  List<String> letterCombinations(String digits) {

        HashMap<Integer, String> Map = new HashMap<>();
        Map.put(2, "abc");
        Map.put(3, "def");
        Map.put(4, "ghi");
        Map.put(5, "jkl");
        Map.put(6, "mno");
        Map.put(7, "pqrs");
        Map.put(8, "tuv");
        Map.put(9, "wxyz");
        System.out.println(Map);
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) {
            return list;
        }
        StringBuilder output = new StringBuilder("");
        solve(Map, digits, list, output, 0);
        return list;
    }

    void solve(HashMap<Integer, String> map, String digits, List<String> list, StringBuilder output, int index) {
        if (index >= digits.length()) {
            list.add(output.toString());
            return; // Add this return statement to stop further recursion
        }

        int digit = digits.charAt(index) - '0';
        String value = map.get(digit);
        for (int i = 0; i < value.length(); i++) { // Correct the loop to start from 0
            char ch = value.charAt(i);
            output.append(ch);
            solve(map, digits, list, output, index + 1);
            output.deleteCharAt(output.length() - 1);
        }
    }
}