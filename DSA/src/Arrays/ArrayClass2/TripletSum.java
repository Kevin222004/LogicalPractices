/*

Triplet sum

find a triple that upon addition give value equal to sum

*/


package DSA.src.Arrays.ArrayClass2;

import java.util.ArrayList;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 60, 30, 80, 70, 90};
        int targetSum = 100;
        System.out.println(findTriplet(arr, targetSum));
    }

    static List<List<Integer>> findTriplet(int[] arr, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        ans.add(List.of(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        return ans;
    }


}
