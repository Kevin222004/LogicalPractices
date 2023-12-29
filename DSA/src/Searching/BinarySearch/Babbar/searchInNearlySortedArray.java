/*

What is nearly sorted array?
-> 1 element which will b eat ith position in an sorted array which is
know at either (i-1),(i) or (i+1)

method -> do it with binary Search

*/


package Searching.BinarySearch.Babbar;

public class searchInNearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 80;
        System.out.println(NearlySortedArraySearch(arr, target));
    }

    static int NearlySortedArraySearch(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);


            if (target == arr[mid]) {
                ans = mid;
                break;
            } else if (target == arr[mid - 1]) {
                ans = mid - 1;
                break;
            }
            else if (arr[mid + 1] == target) {
                ans = mid+1;
                break;

            }

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return ans;
    }


}
