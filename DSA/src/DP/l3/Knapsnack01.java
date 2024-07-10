package DP.l3;

import java.util.Arrays;

public class Knapsnack01 {
    public static void main(String[] args) {
        int[] weight = {4, 5, 1};
        int[] value = {1, 2, 3};
        int n = value.length - 1;
        int capacity = 4;

//        int ans = solveUsingRecursion(weight, value, n, capacity);
//
//        int[][] dp = new int[n+1][capacity+1];
//        for (int[] ints : dp) {
//            Arrays.fill(ints, -1);
//        }
//        int ans = SolveUsingTopDown(weight, value, n, capacity, dp);
        int ans = solveUsingBottomUp(weight, value, value.length, capacity);
        System.out.println(ans);
    }

    // solveUsingRecursion {n here index of last element} we are moving right ot left
    static int solveUsingRecursion(int[] weight, int[] value, int index, int capacity) {
        if (index == 0) {
            if (weight[0] < capacity) {
                return value[0];
            } else {
                return 0;
            }
        }

        // include
        int include = 0;
        if (weight[index] < capacity) {
            include = value[index] + solveUsingRecursion(weight, value, index - 1, capacity - weight[index]);
        }

        // exclude
        int exclude = solveUsingRecursion(weight, value, index - 1, capacity);
        int ans = Math.max(include, exclude);
        return ans;
    }

    // Top-Down
    static int SolveUsingTopDown(int[] weight, int[] value, int index, int capacity, int[][] dp) {
        if (index == 0) {
            if (weight[0] < capacity) {
                return value[0];
            } else {
                return 0;
            }
        }

        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }

        // include
        int include = 0;
        if (weight[index] < capacity) {
            include = value[index] + SolveUsingTopDown(weight, value, index - 1, capacity - weight[index], dp);
        }

        // exclude
        int exclude = SolveUsingTopDown(weight, value, index - 1, capacity, dp);
        dp[index][capacity] = Math.max(include, exclude);
        return dp[index][capacity];
    }

    // bottom up
    static int solveUsingBottomUp(int[] weight, int[] value, int n, int capacity) {

        int[][] dp = new int[n][capacity + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int w = weight[0]; w <= capacity; w++) {
            if (weight[0] <= capacity) {
                dp[0][w] = value[0];
            } else {
                dp[0][w] = 0;
            }
        }

        for (int index = 1; index < n; index++) {
            for (int wt = 0; wt <= capacity; wt++) {
                // include
                int include = 0;
                if (weight[index] <= wt) {
                    include = value[index] + dp[index - 1][wt - weight[index]];
                }

//                exclude
                int exclude = dp[index - 1][wt];

                dp[index][wt] = Math.max(include, exclude);

            }
        }
        return dp[n - 1][capacity];
    }

    // solveUsing Space optimization
    static int solveUsingSpaceOptimization(int[] weight, int[] value, int n, int capacity) {
        int[] prev = new int[capacity + 1];
        int[] curr = new int[capacity + 1];

        for (int w = weight[0]; w <= capacity; w++) {
            if (weight[0] <= capacity) {
                prev[w] = value[0];
            } else prev[w] = 0;
        }

        for (int index = 1; index < n; index++) {
            for (int wt = 0; wt <= capacity; wt++) {
                //include and exclude
                int include = 0;
                if (weight[index] <= wt) include = value[index] + prev[wt - weight[index]];

                int exclude = prev[wt];

                curr[wt] = Math.max(include, exclude);
            }
            //shift mistake point
            prev = curr;
        }
        return prev[capacity];
    }
}
