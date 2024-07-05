package Searching.BinarySearch.Prac;

public class LastOccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 4, 5, 5,  6, 7, 9};
        System.out.println(lastOccurence(arr, 4));
    }

    static int lastOccurence(int[] arr, int num) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            if (arr[mid] == num) {
                ans = mid;
                start = mid + 1;
            }
            else if (num < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
