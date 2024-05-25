/*

Problem :- 46. Permutations

 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob46 {
    public static void main(String[] args) {

    }

}

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
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
            output.add(perm);
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