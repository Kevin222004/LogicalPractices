package DSA.src.Arrays.ArrayClass1;

public class ExtremePrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ExtremePrint(arr);

    }

    public static void ExtremePrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - i - 1;
            if (i > j) {
                break;
            } else if (i == j) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " " + arr[j] + " ");
            }
        }
    }

}
