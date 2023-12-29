// Transpose the matrix

package Arrays.ArrayClass3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(TransposeMatrix(arr));
    }

    static List<List<Integer>> TransposeMatrix(int[][] matrix) {
        List<List<Integer>> transpose = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            List<Integer> transposedCol = new ArrayList<>();
            for (int col = 0; col < matrix[row].length; col++) {
                transposedCol.add((matrix[col][row]));
            }
           transpose.add(transposedCol);
        }
        return transpose;
    }
}
