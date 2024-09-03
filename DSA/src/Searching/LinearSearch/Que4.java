package Searching.LinearSearch;

import java.util.Arrays;

public class Que4 {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {1, 2, 3},
                        {4, 5, 6, 7, 8, 9},
                        {10, 11, 12, 13}
                };

        System.out.println(Arrays.toString(searchIn2DArray(arr, 11)));

    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        int[] ans = new int[2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    ans[0] = row;
                    ans[1] = col;
                }
            }
        }
        return ans;
    }
}
