/*

https://leetcode.com/problems/combination-sum-ii/
*/

package RecursionAndBackTracking.Assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            getCombSum(candidates, target, ans, new ArrayList<>(), 0);
            return ans;
        }

        void getCombSum(int[] arr, int target, List<List<Integer>> ans, List<Integer> path, int start) {
            if (target < 0) {
                return;
            }
            if (target == 0) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = start; i < arr.length; i++) {
                if (i > start && arr[i] == arr[i - 1]) {
                    continue;
                }
                path.add(arr[i]);
                getCombSum(arr, target - arr[i], ans, path, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
}
