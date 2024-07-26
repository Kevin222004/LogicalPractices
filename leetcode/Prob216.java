package leetcode;

import java.util.*;

public class Prob216 {
    public static void main(String[] args) {
        Solution216 sol = new Solution216();
        System.out.println(sol.combinationSum3(3, 7));
    }
}
class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sol(finalAns, temp, k, n, 1);
        return finalAns;
    }

    void sol(List<List<Integer>> finalAns, List<Integer> temp, int k , int n, int start) {
        if (n == 0 && temp.size() == k) {
            List<Integer> ans = new ArrayList<>(temp);
            finalAns.add(ans);
            return;
        }

        for (int i = start; i < 9; i++) {
            temp.add(i);
            sol(finalAns, temp, k, n-i, i+1);
            temp.remove(temp.size()-1);
        }

    }
}
