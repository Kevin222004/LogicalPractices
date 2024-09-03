package Arrays.Assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int total_element = m * n;

        int startingrow = 0;
        int endingcol = n - 1;
        int endingrow = m - 1;
        int startingcol = 0;

        int count = 0;
        while (count < total_element) {
            // print starting row
            for (int i = startingcol; i <= endingcol && count < total_element; i++) {
                ans.add(matrix[startingrow][i]);
                count++;
            }
            startingrow++;
            // printing ending col
            for (int i = startingrow; i <= endingrow && count < total_element; i++) {
                ans.add(matrix[i][endingcol]);
                count++;
            }
            endingcol--;

            // printing ending row
            for (int i = endingcol; i >= startingcol && count < total_element; i--) {
                ans.add(matrix[endingrow][i]);
                count++;
            }
            endingrow--;

            // print starting col
            for (int i = endingrow; i >= startingrow && count < total_element; i--) {
                ans.add(matrix[i][startingcol]);
                count++;
            }
            startingcol++;
        }
        return ans;
    }
}
