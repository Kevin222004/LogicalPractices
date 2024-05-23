package RecursionAndBackTracking.DNCAndBack.l1;

import java.util.Arrays;

public class MergeSort {
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
