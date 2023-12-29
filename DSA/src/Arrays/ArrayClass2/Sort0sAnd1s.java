/*

sort 0's and 1's

sort that all the 0 on left side and all the 1 on right side

*/

package Arrays.ArrayClass2;

import java.util.Arrays;

public class Sort0sAnd1s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void SortArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (i != end)
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;

            }
    }
}
