package RecursionAndBackTracking.Kunal.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 1, 4, 56, 32, 8};
        System.out.println(Arrays.toString(arr1));
        sort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is correct index, please sort two halves
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
