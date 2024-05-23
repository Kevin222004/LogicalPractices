package Recursion.l3;

public class ArraySortedOrNot {
    public static void main(String[] args) {

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i>arr.length) {
            return true;
        }
        if (arr[i] >= arr[i-1]) {
            return isSorted(arr, i+1);
        }
        else {
            return false;
        }
    }
}
