/*
Problem :- 47. Permutations II


 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob47 {
}

class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        allPerm(nums, 0, output);
        return output;
    }

    void allPerm(int[] nums, int i, List<List<Integer>> output) {
        if (i == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            if (!output.contains(perm)) {
                output.add(perm);
            }
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            allPerm(nums, i + 1, output);
            swap(nums, i, j);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}