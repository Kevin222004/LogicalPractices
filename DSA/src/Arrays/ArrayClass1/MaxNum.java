package DSA.src.Arrays.ArrayClass1;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {11115, 311111111, 12, 67, 833};
        System.out.println(minNum(arr));
    }

    public static int maxNum(int[] arr) {
        int val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }
        }
        return val;
    }

    public static int minNum(int[] arr) {
        int val = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < val) {
                val = arr[i];
            }
        }
        return val;
    }
}
