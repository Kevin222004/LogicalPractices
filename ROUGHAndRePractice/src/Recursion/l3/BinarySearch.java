package Recursion.l3;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 20, 22};
        System.out.println(binarySearch(arr, 0, arr.length-1, -522));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = start + ((end - start))/2;
        if (start>=end) {return -1;}
        if (arr[mid] > target) {
            end = mid;
            return binarySearch(arr, start, end, target);
        }
        else if (arr[mid] < target) {
            start = mid + 1;
            return binarySearch(arr, start, end, target);
        }
        else {
            return mid;
        }
    }
}
