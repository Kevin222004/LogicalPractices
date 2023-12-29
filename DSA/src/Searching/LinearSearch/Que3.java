// find min number

package Searching.LinearSearch;

public class Que3 {

    public static void main(String[] args) {
        int[] arr = {7,3, 6, 74, 31, -234 ,44, 99};
        System.out.println(MinNum(arr));
    }

    static int MinNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}


