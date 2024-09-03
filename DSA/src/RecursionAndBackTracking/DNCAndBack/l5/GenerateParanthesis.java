package RecursionAndBackTracking.DNCAndBack.l5;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        StringBuilder output = new StringBuilder("");
        solve(list, n, open, close, output);
        return list;
    }

    void solve(List<String> list, int n, int open, int close, StringBuilder output) {
        if (open == 0 && close == 0) {
            list.add(output.toString());
            return;
        }

        // include open bracket
        if (open > 0) {
            output.append('(');
            solve(list, n, open - 1, close, output);
            output.deleteCharAt(output.length());
        }
        // include close bracket
        if (close > open) {
            output.append(')');
            solve(list, n, open, close - 1, output);
            output.deleteCharAt(output.length());
        }
    }
}