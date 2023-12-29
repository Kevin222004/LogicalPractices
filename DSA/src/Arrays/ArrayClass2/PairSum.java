/*

Pair sum

find a pair that upon addition give value equal to sum

*/

package Arrays.ArrayClass2;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 0, 9};
        int targetSum = 9;
        System.out.println(findPair(arr, targetSum));
    }

    public static List<List<Integer>> findPair(int[] arr, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    ans.add(List.of(arr[i], arr[j]));
                }
            }
        }
        return ans;
    }
}
