/*

Move all -VE to left side not mainataing order is fine for this

Method-1 :- sorting
mehtod-2 :- DutchNationalFlagAlgorithm (2 pointer approach)

*/

package Arrays.ArrayClass3;

import java.util.Arrays;

public class moveAllNegativetoInOneSideOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -2, 1, -23, -43, -23};
        System.out.println(Arrays.toString(moveNegativeElementsToLeftSide2(arr)));
    }

    // 2 pointer
    static int[] moveNegativeElementsToLeftSide(int[] arr) {
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[point];
                arr[point] = temp;
                point++;
            }
        }
        return arr;
    }

    // 2 pointer same implemenatation in different way
    static int[] moveNegativeElementsToLeftSide2(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] < 0) {
                low++;
            } else if (arr[high] > 0) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        return arr;
    }

}
