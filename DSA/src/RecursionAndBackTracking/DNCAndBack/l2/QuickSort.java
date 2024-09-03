/*
array in input
arr[] = {8, 2, 4, 1, 20, 50, 30}

we will pick 1 element and put that elemnt in its correct position such that all the
big element must be in right and all the small element in left



 */

package RecursionAndBackTracking.DNCAndBack.l2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 5, 89, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

    public static int[] quickSort(int[] arr, int s, int e) {
        // base case
        if (s >= e) {
            return arr;
        }

        // partition logic
        int p = partition(arr, s, e);

        // recursive call
        // pivot -> left
        int[] left = quickSort(arr, s, p - 1);
        // pivot -> right
        int[] right = quickSort(arr, p + 1, e);

        return arr;
    }

    static int partition(int[] arr, int s, int e) {
        // step 1 :- choose pivot element
        int pivotIndex = s;
        int pivotElement = arr[s];

        // step 2 :- find right pos for elemtn to place it here
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }
        int rightIndex = s + count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
        pivotIndex = rightIndex;
        // left me chote and right me bade
        int i = s;
        int j = e;

        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivotElement) {
                i++;
            }
            while (arr[j] > pivotElement) {
                j--;
            }

            // 2 case ho sakte
            // A -> you found the elelmet to swap
            // b -> no need for swap
            if (i < pivotIndex && j > pivotIndex) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
            }
        }

        return pivotIndex;
    }
}