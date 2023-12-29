/*

--> total occurence

method 1 :- last occurnece - first occurence + 1;

*/

package Searching.BinarySearch.Babbar;

public class TotalOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 4, 5, 5, 6, 7, 9};
        System.out.println(totalOccurence(arr, 4));
    }

    static int totalOccurence(int[] arr, int num) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if(arr[start] == num || arr[mid] == num) {
                ans++;
            }
            if (arr[mid] == num) {
                ans++;
                start = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
