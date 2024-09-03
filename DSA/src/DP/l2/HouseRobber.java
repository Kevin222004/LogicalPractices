package DP.l2;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        SolutionHouseRobber sol = new SolutionHouseRobber();
        System.out.println(sol.rob(arr));
    }
}

class SolutionHouseRobber {
    public int rob(int[] nums) {
        return roberryWithRecursion(nums, 0);
        // int[] dpArr = new int[nums.length+1];
        // Arrays.fill(dpArr, -1);
        // return roberryWithTopDown(nums, nums.length-1, dpArr);
//        return roberryWithBottomUp(nums);
//        return roberryWithSpaceOptimization(nums, nums.length-1);
    }

    // recursion (TLE)
    int roberryWithRecursion(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        int inclusion = roberryWithRecursion(nums, index + 2) + nums[index];
        int exclusion = roberryWithRecursion(nums, index + 1);

        return Math.max(inclusion, exclusion);
    }

    // recursion + topdown
    int roberryWithTopDown(int[] nums, int n, int[] dp) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return nums[0];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int inclusion = roberryWithTopDown(nums, n - 2, dp) + nums[n];
        int exclusion = roberryWithTopDown(nums, n - 1, dp);

        dp[n] = Math.max(inclusion, exclusion);
        return dp[n];
    }

    // BottomUp
    int roberryWithBottomUp(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = 0;
            if (i - 2 >= 0) {
                temp = dp[i - 2];
            }
            int include = temp + nums[i];
            int exclusion = dp[i - 1];

            dp[i] = Math.max(include, exclusion);
        }
        return dp[nums.length - 1];
    }

    // depends on dp[i-2] and dp[i-1]
    // space optimization
    int roberryWithSpaceOptimization(int[] nums, int n) {
        int prev2 = 0;
        int prev1 = nums[0];
        // vector<int> dp(n+1, 0);
        // dp[0] = nums[0];
        int curr = 0;
        for (int i = 1; i <= n; i++) {

            int temp = 0;
            if (i - 2 >= 0)
                temp = prev2;

            int include = temp + nums[i];
            int exclude = prev1 + 0;

            curr = Math.max(include, exclude);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}








