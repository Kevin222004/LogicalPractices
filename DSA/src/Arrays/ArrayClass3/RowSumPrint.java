// Print the sum of Row

package Arrays.ArrayClass3;

import java.util.ArrayList;
import java.util.List;

public class RowSumPrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(rowSum(arr));

    }

    static List<Integer> rowSum(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i< arr.length; i++) {
            int sum = 0;
            for (int j : arr[i]) {
                sum = j + sum;
            }
            ans.add(sum);
        }
        return ans;
    }

}
