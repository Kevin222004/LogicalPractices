// colwise sum

package Arrays.ArrayClass3;

import java.util.ArrayList;
import java.util.List;

public class colSumPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(colSum(arr));

    }

    static List<Integer> colSum(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int row = 0; row< arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = arr[col][row] + sum;
            }
            ans.add(sum);
        }
        return ans;
    }

}
