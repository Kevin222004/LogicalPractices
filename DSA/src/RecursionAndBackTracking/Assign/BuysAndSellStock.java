/*

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

better sol https://www.youtube.com/watch?v=1pkOgXD63yU

*/

package RecursionAndBackTracking.Assign;

public class BuysAndSellStock {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
//        System.out.println(sol.maxProfit(prices));

        // 2 pointer
        //
        int mini = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int diff = prices[i] - mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, prices[i]);
        }
        System.out.println(profit);
    }


    // worst way
    static class Solution {
        public int maxProfit(int[] prices) {
            int ans = Integer.MIN_VALUE;
            int finala = Integer.MIN_VALUE;

            for (int i = 0; i < prices.length - 1; i++) {
                finala = Math.max(finala,  method(prices, i, i + 1, ans));
            }
            if (finala < 0) {
                return 0;
            }
            return finala;
        }

        int method(int[] prices, int start, int index, int ans) {
            if (index >= prices.length) {
                return ans;
            }

            ans = Math.max(prices[index] - prices[start], ans);
            return method(prices, start, index + 1, ans);
        }
    }
}
