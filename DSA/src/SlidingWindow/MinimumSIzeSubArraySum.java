/*

variable size window

https://leetcode.com/problems/minimum-size-subarray-sum/

 */
package SlidingWindow;

public class MinimumSIzeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;

        while (j < nums.length) {
            // include current number
            sum = sum + nums[j];

            // mere pass ek window ka sum ready he
            while (sum >= target) {
                // minimise  -> sum se decrease karo, length bhi update karna, start ko age badhana
                len = Math.min(len, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }

        if (len == Integer.MAX_VALUE) {
            return 0;
        } else {
            return len;
        }
    }
}
