/*
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

output :- 1, 5, 9, 10, 6, 2, 3, 7, 11, 12, 4, 8
as per the output in odd we go bottom to top else top to bootttm


*/

package Arrays.Assign;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {1,3, 4}
        };
        printWave(arr);
    }

    public static void printWave(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int startCol = 0; startCol < n; startCol++) {
            // even no top to bottom
            if ((startCol & 1) == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(mat[i][startCol] + " ");
                }
            }
            else {
                // odd no if col -> Bottom to top
                for (int i = m-1; i>=0; i--) {
                    System.out.print(mat[i][startCol] + " " );
                }
            }
            System.out.println();
        }
    }
}
