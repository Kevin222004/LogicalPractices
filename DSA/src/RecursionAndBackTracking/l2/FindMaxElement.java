package RecursionAndBackTracking.l2;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 34, 534, 23, 14, 6};
        int maxNum = findMax(arr, 0, arr.length);
        System.out.println(maxNum);
    }

    static int findMax(int[] arr, int i, int length) {
        if (i >= length) {
            return Integer.MIN_VALUE;
        }

        int maxInRest = findMax(arr, i + 1, length);

        // Compare the current element with the maximum in the rest of the array
        return Math.max(arr[i], maxInRest);
    }
}
