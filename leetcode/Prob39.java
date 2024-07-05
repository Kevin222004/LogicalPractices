package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob39 {
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        System.out.println(sol.combinationSum(new int[]{2,3,6,7}, 7));
    }
}
class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombSum(candidates, target, ans, new ArrayList<>(),0, 0);
        return ans;
    }

    void getCombSum(int[] arr, int target, List<List<Integer>> ans, List<Integer> path, int start, int index) {
        if (target == 0 && index < arr.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (index < arr.length) {
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < arr.length; i++) {
            int ele = arr[i];
            path.add(ele);
            getCombSum(arr, target-ele, ans, path, i, index++);
            path.remove(path.size()-1);
        }
    }
}
