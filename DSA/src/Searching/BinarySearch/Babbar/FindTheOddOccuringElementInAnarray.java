/*
video 3 - last question
In an array all eleemnt are in even accept 1 element which in odd
int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 3, 600, 600, 4, 4};

method 1 :- do xor operation
method 2 :- using binary search
 */

package Searching.BinarySearch.Babbar;

public class FindTheOddOccuringElementInAnarray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 3, 600, 600, 4, 4};
        System.out.println(OddOccuringElement(arr));
    }

    static int OddOccuringElement(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (start == end) {
                return arr[mid];
            }

            // 2 cases even and odd
            if (mid%2==0) {
                if (arr[mid] == arr[mid+1]) {
                    start = mid + 2;
                }
                else {
                    end = mid;
                }
            }
            else {
                if (arr[mid] == arr[mid-1]) {
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
