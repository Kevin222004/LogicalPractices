package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob118 {
    public static void main(String[] args) {
        Solution118 sol = new Solution118();
        System.out.println(sol.generate(5));
    }
}

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    temp.add(1);
                } else {
                    int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                    temp.add(val);
                }
            }

            ans.add(temp);
        }

        ans = ans.subList(1, ans.size());
        return ans;
    }
}