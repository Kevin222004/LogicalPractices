/*

Dutch national flag (2 pointer)

 */

package Arrays.Assign;

import java.util.Arrays;

// assNNumLeft(arr)umption order not matter
public class MoveAllNegativeNumberToLeft {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -2, -3, 4};
        NNumLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void NNumLeft(int [] arr) {
        int l = 0;
        int h = arr.length-1;
        while (l <= h) {
            if (arr[l] < 0) {
                l++;
            } else if (arr[h] > 0) {
                h--;
            }else {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
        }
    }
}
