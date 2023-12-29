/*

Intersection of 2 Array

Common element from 2 array

*/

package Arrays.ArrayClass2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2,2, 4, 5};

        System.out.println(intersectionArray(arr1, arr2));
    }

    static List<Integer> intersectionArray(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ans.add(arr1[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
