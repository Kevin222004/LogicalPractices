package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Prob16 {
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        int[] arr = {4,0,5,-5,3,3,0,-4,-5};
        System.out.println(sol.threeSumClosest(arr, -2));
    }
}

// not completed
class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0 ;
        ArrayList<Integer> store = new ArrayList<>();
        int point = 0;
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2]  ;
        }
        for (int i = point+2; i < nums.length; i++) {
            store.add(nums[i-2] + nums[i-1] + nums[i]);
            point++;
        }
        int tempANs = Integer.MAX_VALUE;
        for (Integer integer : store) {
            if (integer == target) {
                return target;
            } else {
                if (Math.abs(integer - target) < tempANs) {
                    tempANs = Math.min(tempANs, integer - target);
                    ans = integer;
                }
            }
        }
        return ans;
    }
}