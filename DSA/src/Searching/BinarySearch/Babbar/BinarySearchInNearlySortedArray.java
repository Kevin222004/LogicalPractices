/*

Binary search in nearly sorted array :-

nearly sorted means in an array any elemnt that should be on ith index that is on i-1,
i or i + 1;

for example
int[] arr = {10, 3, 40, 20, 50, 80, 70};
                    |
                    |
                    v
int[] arr = {3, 10, 20, 40, 50, 70, 80};

for lets suppose 3 is at i + 1; instead of i

*/

package Searching.BinarySearch.Babbar;

public class BinarySearchInNearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        System.out.println(findTarget(arr, 40));
    }

    public static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (mid-1>=0&&arr[mid - 1] == target) {
                return mid-1;
            }
            else if (mid+1<arr.length&&arr[mid + 1] == target) {
                return mid+1;
            }
            else if (arr[mid] < target) {
                start = mid + 2;
            }
            else {
                end = mid -2;
            }
        }
        return -1;
    }
}
