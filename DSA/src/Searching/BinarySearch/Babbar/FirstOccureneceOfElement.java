/*

--> find the first occurrence of the element

--> ex input --> {1, 3, 4, 4, 4, 4, 4, 4, 6, 7, 9} --> output First occurrence  is index-2 do this with binary search

*/

package Searching.BinarySearch.Babbar;

public class FirstOccureneceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 4, 4, 4, 5, 5,  6, 7, 9};
        System.out.println(FirstOccurenece(arr, 2));
    }

    static int FirstOccurenece(int[] arr, int num) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            if (arr[mid] == num) {
                ans = mid;
                end = mid - 1;
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
