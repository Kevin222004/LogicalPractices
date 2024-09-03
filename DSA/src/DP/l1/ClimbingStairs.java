package DSA.src.DP.l1;

import java.util.Arrays;

public class ClimbingStairs {
}

class Solution {
    public int climbStairs(int n) {
        // int[] dpArray = new int[n+1];
        // Arrays.fill(dpArray, -1);
        return countTotal(n);
    }

    // recursive

    int countTotal1(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return countTotal1(n - 1) + countTotal1(n - 2);
    }

    // top-down approach
    int countTotal2(int n, int[] dpArray) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (dpArray[n] != -1) {
            return dpArray[n];
        }

        dpArray[n] = countTotal2(n - 1, dpArray) + countTotal2(n - 2, dpArray);
        return dpArray[n];
    }

    // bOTTOM UP approach
    int countTotal3(int n) {
        int[] dpArray = new int[n + 1];
        Arrays.fill(dpArray, -1);
        dpArray[0] = 1;
        dpArray[1] = 1;
        if (n == 1 || n == 0) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            dpArray[i] = dpArray[i - 1] + dpArray[i - 2];
        }
        return dpArray[n];
    }

    // spaceOptimization
    int countTotal(int n) {
        // step 1 2 pointer
        int prev2 = 1;
        int prev1 = 1;
        if (n == 0) {
            return prev2;
        }
        if (n == 1) {
            return prev1;
        }

        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            // shifting
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
