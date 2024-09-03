package Arrays.ArrayClass3;

import java.util.ArrayList;
import java.util.List;

public class DiagonalPrint {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(findDiagonalOrder(mat));
    }

    // {
// (1, 1), (1, 2), (2, 1), (3, 1), (2, 2), (1, 3), (2, 3), (3, 2), (3, 3)
// }
//
    public static List<Integer> findDiagonalOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int row = 0, col = 0;
        ans.add(mat[row][col]);
        for (int i = 0; i < mat.length; i++) {
            if (row == 0) {
                while (row < mat.length) {
                    ans.add(mat[row][col]);
                    row++;

                }
            }
//            if ( col != mat[row].length) {
//                ans.add(mat[row][col]);
//                row--;
//                col++;
//
//            }
            i++;
        }
        return ans;
    }
}
