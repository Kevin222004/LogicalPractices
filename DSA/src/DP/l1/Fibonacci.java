/*

https://leetcode.com/problems/fibonacci-number/description/

*/

package DP.l1;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
}

class SolutionFib {

    public int fib(int n) {
//        int ans = recursiveSolve(n);
        int[] dpArray = new int[n+1];
        Arrays.fill(dpArray, -1);
        int ans = topDown(n, dpArray);
        return ans;
    }

    // recursive solution
    int recursiveSolve(int n) {
        // base case
        if (n == 1 || n == 0) {
            return n;
        }

        int ans = recursiveSolve(n - 1) + recursiveSolve(n - 2);
        return ans;
    }

    /*-----------------------------Top-Down--------------------------------------*/

    // Top-Down Approach (Recursion + memoization)
    int topDown(int n, int[] dpArray) {
        if (n == 1 || n == 0) {
            return n;
        }
        // step 3 check if ans already exist
        if (dpArray[n] != -1) {
            return dpArray[n];
        }

        // step 2 replace ans with dp[n]
        dpArray[n] = topDown(n-1, dpArray) + topDown(n-2, dpArray);
        return dpArray[n];
    }


    /*-----------------------------Bottom-up-------------------------------------*/

    // Bottom-Up (Tabulation)
    int BottomUp(int n) {

        if (n == 0) return 0;

        // step 1 create dp array
        int[] dpArray = new int[n + 1];
        Arrays.fill(dpArray, -1);

        // step 2 observe base case in above solution
        dpArray[0] = 0;
        dpArray[1] = 1;

        // step 3
        for (int i = 2; i <= n; i++) {
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }

        return dpArray[n];
    }


    /*-----------------------------spaceOptimization-------------------------------------*/

    // spaceOptimization
    int spaceOptimization(int n) {
        // step 1 2 pointer
        int prev2 = 0;
        int prev1 = 1;
        if (n == 0) {
            return prev2;
        }
        if (n == 1) {
            return prev1;
        }

        int curr = 0;

        for (int i = 2; i<=n; i++) {
            curr = prev1 + prev2;
        }

        return curr;
    }


}