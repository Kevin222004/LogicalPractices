package practice.Searching;

public class FindFirstOccurenceofEleemnt {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 4, 5, 5,  6, 7, 9};
        System.out.println(FirstOccurenece(arr, 4));
        System.out.println(LastOccurenece(arr, 4));
        System.out.println("Total Occurences --> " + (LastOccurenece(arr, 4) - FirstOccurenece(arr, 4) + 1));
    }

    public static int FirstOccurenece(int[] arr, int element) {
        int ans = Integer.MAX_VALUE;

        int start = 0, end = arr.length;

        while (start <= end) {
            int mid = start + ((end-start)/2);

            if (arr[mid] == element) {
                ans = Integer.min(ans, mid);
                end = mid -1;
            }
            else if (element < arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int LastOccurenece(int[] arr, int element) {
        int ans = Integer.MIN_VALUE;

        int start = 0, end = arr.length;

        while (start <= end) {
            int mid = start + ((end-start)/2);

            if (arr[mid] == element) {
                ans = Integer.max(ans, mid);
                start = mid + 1;
            }
            else if (element < arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
