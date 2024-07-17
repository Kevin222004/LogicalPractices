/*

https://leetcode.com/problems/combination-sum/description/

*/

package RecursionAndBackTracking.Assign;

import java.util.*;

public class CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<
                    List<Integer>> ans = new ArrayList<>();
            getCombSum(candidates, target, ans, new ArrayList<>(),0);
            return ans;
        }

        void getCombSum(int[] arr, int target, List<List<Integer>> ans, List<Integer> path, int start) {
            if (target == 0) {
                ans.add(new ArrayList<>(path));
                return;
            }
            if (target < 0) {
                return;
            }

            for (int i = start; i < arr.length; i++) {
                int ele = arr[i];
                path.add(ele);
                getCombSum(arr, target-ele, ans, path, i);
                path.remove(path.size()-1);
            }
        }
    }

}
