// logic in notebook

package DP.l3;
import java.util.*;
public class PaintingFence {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
//        int ans = solveUsingRecursion(n, k);
//        int [] arr = new int[n+1];
//        Arrays.fill(arr, -1);
//        int ans = solveTopDown(n, k , arr);
        int ans = solveSpaceOptimization(n,k);
        System.out.println(ans);
    }

    // simple recursion solution
    static int solveUsingRecursion(int n, int k) {
        if (n ==1) {
            return k;
        }
        if (n == 2) {
            return (k+k*(k-1));
        }

        int ans = (solveUsingRecursion(n-2, k) + solveUsingRecursion(n-1, k)) * (k-1);
        return ans;
    }

    // Top- down
    static int solveTopDown(int n, int k, int[] dp) {
        if (n ==1) {
            return k;
        }
        if (n == 2) {
            return (k+k*(k-1));
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = (solveTopDown(n-2, k, dp) + solveTopDown(n-1, k, dp)) * (k-1);
        return dp[n];
    }

    // Bottom - up
    static int solveBottomUp(int n, int k) {
        int[] dp = new int[n+1];
        dp[1] = k;
        dp[2] = k + k*(k-1);
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) * (k-1);
        }
        return dp[n];
    }

    // space optimization
    static int solveSpaceOptimization(int n, int k) {
        int prev2 = k;
        int prev1 = k + k*(k-1);
        for (int i = 3; i <= n; i++) {
            int curr = (prev2+prev1)*(k-1);

            // bar bar bhuloge shifting logic
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

}
