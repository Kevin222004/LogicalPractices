// https://leetcode.com/problems/maximum-subarray/description/
// solved using kadane's  it is eassy

package RecursionAndBackTracking.Assign;

public class MaxSubArraySum {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];

        for (int i =0; i < nums.length; i++) {
            sum += nums[i];

            maxi = Math.max(sum, maxi);

            if (sum < 0) {
                sum = 0;
            }

        }

        return maxi;


    }
}
