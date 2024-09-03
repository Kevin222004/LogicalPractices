// https://leetcode.com/problems/house-robber/

package RecursionAndBackTracking.Assign;

public class HouseRobberProblem {
    int roberryWithRecursion(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        int inclusion = roberryWithRecursion(nums, index + 2);
        int exclusion = roberryWithRecursion(nums, index + 1);

        return Math.max(inclusion, exclusion);
    }
}
