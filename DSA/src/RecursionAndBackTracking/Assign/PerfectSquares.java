/*

https://leetcode.com/problems/perfect-squares/description/

*/

package RecursionAndBackTracking.Assign;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(solvePsq(12, (int) Math.sqrt(12)));
    }

    // recursion
    static int solvePsq (int n, int end) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i =1; i <= end; i++) {
            int ans = solvePsq(n-(i*i), end);
            if (ans != Integer.MIN_VALUE) {
                mini = Math.min(ans + 1, mini);
            }
        }
        return mini;
    }

    // recursion + memo
    int solvePsqMemo (int n, int end, int[] dpArray) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }
        if (dpArray[n] != -1) {
            return dpArray[n];
        }
        int mini = Integer.MAX_VALUE;
        for (int i =1; i <= end; i++) {
            int ans = solvePsqMemo(n-(i*i), end, dpArray);
            if (ans != Integer.MIN_VALUE) {
                mini = Math.min(ans + 1, mini);
            }
        }
        dpArray[n] = mini;
        return dpArray[n];
    }
}
