// swap
package Arrays.KunalsArray;

import java.util.Arrays;

public class programme1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int max(int[] x) {
        int el = 0;
        for (int i = 0; i < x.length; i++) {
            if (el < x[i]) {
                el = x[i];
            }
        }
        return el;
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
