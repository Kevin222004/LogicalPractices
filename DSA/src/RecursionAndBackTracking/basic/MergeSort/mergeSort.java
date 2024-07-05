/*

Divide among into 2 parts

get both parts sorted via recursion

merge 2 sort part


how to merge

arr1 = 3, 5, 9

arr2 = 4, 6, 8

newarr = take 2 point 1 at 3 and 1 ar 4 then check if 3 is bigger or 4 put 4 then put 3 in new array
,ove pointer ahead of 3 which go to 5 .

*/

package RecursionAndBackTracking.basic.MergeSort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 1,4, 56, 32, 8};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(MergeSort(arr1)));
    }

    static int[] MergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr2.length + arr1.length];
        int i = 0, j =0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            }
            else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
