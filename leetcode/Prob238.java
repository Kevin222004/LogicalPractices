package leetcode;

import java.util.Arrays;

public class Prob238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Solution238 s = new Solution238();
        System.out.println(Arrays.toString(s.productExceptSelf(arr)));
    }
}

class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}