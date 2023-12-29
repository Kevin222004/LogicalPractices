/*

Print matrix rowwise

*/

package Arrays.ArrayClass3;

public class Print2DArrayColoumnwise {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        for (int row = 0; row< arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[col][row] + " ");
            }
            System.out.println();
        }
    }
}
