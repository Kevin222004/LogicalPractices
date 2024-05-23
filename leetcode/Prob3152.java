package leetcode;

public class Prob3152 {
}

// TLE

class Solution2 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ansArr = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (isArraySpecial(nums, queries[i][0], queries[i][1])) {
                ansArr[i] = true;
            }
            else {
                ansArr[i] = false;
            }
        }
        return ansArr;
    }

    public boolean isArraySpecial(int[] arr, int start, int end) {
        if (arr.length == 1) {
            return true;
        }
        else {
            for (int i = start + 1; i <= end; i++) {
                if ((arr[i - 1] % 2) == (arr[i] % 2)) {
                    return false;
                }
            }
        }
        return true;
    }
}