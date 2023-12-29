package RecursionAndBackTracking.l2;

public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;arr[1] = 2;arr[2] = 3;arr[3] = 4;arr[4] = 5;
        printReverse(arr, 0, arr.length);
    }

    static void print(int[] arr, int i, int length) {
         // base case
        if (i >= length) {
            return;
        }

        System.out.println(arr[i]);
        print(arr, i+1, length);
    }

    static void printReverse(int[] arr, int i, int length) {
        // base case
        if (i >= length) {
            return;
        }
        printReverse(arr, i+1, length);

        System.out.print(arr[i]);
    }

}
