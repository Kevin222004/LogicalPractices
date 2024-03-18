package Array;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6};
        int targetSum = 9;
        System.out.println(PairSum(arr, targetSum));
    }

    public static List<List<Integer>> PairSum(int[] arr, int targetSum) {
        List<List<Integer>> ansArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j] == targetSum) {
                    ansArray.add(List.of(arr[i], arr[j]));
                }
            }
        }

        return ansArray;
    }
}
