package Array;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        PrintReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void PrintReverseArray(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
}
