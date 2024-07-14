/*

https://leetcode.com/problems/partition-equal-subset-sum/description/

*/
package DP.l4;

import java.util.Arrays;

public class PartitionEqualSubSetSum {
    public static void main(String[] args) {

    }
}

class SolutionPartitionEqualSubSetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        // yaha pe galti hoga
        if (sum %2 != 0) {
            return false;
        }
        boolean ans = SolveUsingRecursion(nums, 0, sum/2);

//        int[][] dp =new int[nums.length+1][sum+1];
//        for (int[] ints : dp) {
//            Arrays.fill(ints, -1);
//        }
//        boolean ans = SolveUsingTopDown(nums, 0, sum/2, dp);
        return ans;
    }

    boolean SolveUsingRecursion(int[] nums, int index, int sum) {
        if (sum <0) {
           return false;
        }
        if (sum == 0) {
            return true;
        }
        if (index >= nums.length) {
            return false;
        }

        boolean include = SolveUsingRecursion(nums, index+1, sum-nums[index]);
        boolean exclude = SolveUsingRecursion(nums, index+1, sum);
        return include || exclude;
    }

    boolean SolveUsingTopDown(int[] nums, int index, int sum, int[][] dp) {
        if (sum <0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        if (index >= nums.length) {
            return false;
        }
        if (dp[index][sum] != -1) {
            if (dp[index][sum] == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        boolean include = SolveUsingTopDown(nums, index+1, sum-nums[index], dp);
        boolean exclude = SolveUsingTopDown(nums, index+1, sum, dp);
        if (include || exclude) {
            dp[index][sum] = 1;
        }
        else {
            dp[index][sum] = 0;
        }
        return include || exclude;
    }

    boolean SolveUsingBottomUp(int[] nums, int sum) {
        int[][] dp =new int[nums.length+1][sum+1];

        for (int i = 0; i < nums.length; i++){
            dp[i][0] = 1;
        }

        for (int i = nums.length-1; i >= 0; i--) {
            for (int t = 1; t <= sum; t++){
                boolean include = false;
                if (t - nums[i] >= 0) {
                    int inc = dp[i + 1][t - nums[i]];
                    if (inc == 1) {
                        include = true;
                    }
                }
                boolean exclude = false;
                int exc= dp[i+1][t];
                if (exc == 1) {
                    exclude = true;
                }

                if (include || exclude) {
                    dp[i][t] = 1;
                }
            }
        }

        return dp[0][sum] == 1;
    }


    // not working
    boolean SolveUsingSapceOpt(int[] nums, int sum) {
        int[] curr = new int[sum + 1];
        int[] next = new int[sum+1];

        curr[0] = 1;
        next[0] = 1;

        for (int i = nums.length-1; i >= 0; i--) {
            for (int t = 1; t <= sum; t++){
                boolean include = false;
                if (t - nums[i] >= 0) {
                    int inc = next[t - nums[i]];
                    if (inc == 1) {
                        include = true;
                    }
                }
                boolean exclude = false;
                int exc= next[t];
                if (exc == 1) {
                    exclude = true;
                }

                if (include || exclude) {
                    curr[t] = 1;
                }

                // shift
                next = curr;
            }

        }

        return curr[sum] == 1;
    }


}
