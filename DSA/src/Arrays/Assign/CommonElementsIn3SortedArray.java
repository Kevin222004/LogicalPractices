/*
T.C = O(n) S.C = O(n)

and duplicate should not be present in output

 */

package Arrays.Assign;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsIn3SortedArray {
    public static void main(String[] args) {
        /* test data 1
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        */
        int[] arr1 = {3,3,3};
        int[] arr2 = {3,3,3};
        int[] arr3 = {3,3,3};

        System.out.println(commonElement(arr1, arr2, arr3));

    }

    public static List<Integer> commonElement(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // in this approach here we can store data in set to check duplicate but we are not doing it
                if (!list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;j++;k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }else if (arr2[j] < arr3[k]) {
                j++;
            }else {
                k++;
            }
        }
        return list;
    }

}
