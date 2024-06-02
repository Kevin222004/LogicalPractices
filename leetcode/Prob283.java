package leetcode;

import java.util.Arrays;

public class Prob283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        Solution283 sol = new Solution283();
        System.out.println(Arrays.toString(nums));
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;

//        while (i <= j) {
            if (nums[i] == 0 && nums[j] != 0) {
                for (int k= i; k < nums.length-1; k++ ) {
                    nums[k] = nums[k+1];
                }
                nums[nums.length-1] = 0;
                j--;
            }

            else if (nums[i] != 0 && nums[j] == 0) {
                i++;
                j--;
            }

            else if (nums[i] != 0 && nums[j] != 0) {
                i++;
            }

            else if (nums[i] == 0 && nums[j] == 0) {
                while (j == 0) {
                    j--;
                }
                for (int k= i; k < nums.length-1; k++ ) {
                    nums[k] = nums[k+1];
                }
                nums[nums.length-1] = 0;
                j--;
            }
        }
//    }
}
