/*

Leetcode 375

*/

package DSA.src.DP.l5;

import java.util.Arrays;

public class GuessNumber {
    public static void main(String[] args) {

    }
}

class Solution {
    public int getMoneyAmount(int n) {
//        int ans = solveUsingRecursion(1, n);

        int[][] dp = new int[n + 1][n + 1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        int ans = solveUsingTopDown(1, n, dp);
        return ans;
    }

    // recursion
    int solveUsingRecursion(int start, int end) {
        if (start >= end) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            ans = Math.min(ans, i + Math.max(solveUsingRecursion(start, i - 1), solveUsingRecursion(i + 1, end)));
        }
        return ans;
    }

    // Top Down
    int solveUsingTopDown(int start, int end, int[][] dp) {
        if (start >= end) {
            return 0;
        }
        if (dp[start][end] != -1) {
            return dp[start][end];
        }
        int ans = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            ans = Math.min(ans, i + Math.max(solveUsingTopDown(start, i - 1, dp), solveUsingTopDown(i + 1, end, dp)));
        }
        return dp[start][end] = ans;
    }

    // Bottom Up
    int solveUsingBottomUp(int n) {
        int[][] dp = new int[n + 2][n + 2];
        for (int start = n; start >= 1; start--) {
            for (int end = 1; end <= n; end++) {
                if (start >= end) {
                } else {
                    int ans = Integer.MAX_VALUE;
                    for (int i = start; i <= end; i++) {
                        ans = Math.min(ans, i + Math.max(dp[start][i - 1], dp[i + 1][end]));
                    }
                    dp[start][end] = ans;
                }
            }
        }

        return dp[1][n];
    }
}
