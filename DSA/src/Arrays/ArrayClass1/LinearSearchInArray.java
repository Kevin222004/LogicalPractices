package DSA.src.Arrays.ArrayClass1;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 24, 56, 442, 3};
        System.out.println(linearSearch(arr, 222));
    }

    public static boolean linearSearch(int[] arr, int target) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
