/*

https://leetcode.com/problems/coin-change/description/

*/

package DP.l2;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {

    }
}

class Solution {

    public int coinChange(int[] coins, int amount) {

        // int ans = MinCoin(coins, amount);
        // if (ans == Integer.MAX_VALUE) {
        //     return -1;
        // }
        // else {
        //     return ans;
        // }

        // int[] arr = new int[amount+1];
        // Arrays.fill(arr, -1);
        // int ans = MinCoinTopDown(coins, amount, arr);
        // if (ans == Integer.MAX_VALUE) {
        //     return -1;
        // }
        // else {
        //     return ans;
        // }

        int ans = MinCoinBottomUP(coins, amount);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }

    /*------------------------------------RecursiveCode------------------------------------------*/
    // recursive code
    public int MinCoin(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int minAns = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = MinCoin(coins, amount - coins[i]);
            if (ans != Integer.MAX_VALUE) {
                minAns = Math.min(minAns, ans + 1);
            }
        }
        return minAns;
    }

    /*----------------------------------TopDown Approach--------------------------------------*/

    public int MinCoinTopDown(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) {
            return dp[amount];
        }
        int minAns = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = MinCoinTopDown(coins, amount - coins[i], dp);
            if (ans != Integer.MAX_VALUE) {
                minAns = Math.min(minAns, ans + 1);
            }
        }
        dp[amount] = minAns;
        return minAns;
    }

    /*------------------------------BottomUp-------------------------------------------------*/

    int MinCoinBottomUP(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    int ans = dp[i - coins[j]];
                    dp[i] = Math.min(dp[i], 1 + ans);
                }
            }
        }
        return dp[amount];
    }

}