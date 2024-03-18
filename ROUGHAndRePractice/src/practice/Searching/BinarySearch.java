package practice.Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {7, 12, 17, 23, 122, 125};
        System.out.println(binarySearchIn1DArray(arr, 122));
    }

    public static int binarySearchIn1DArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
