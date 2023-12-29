// search in range

package Searching.LinearSearch;

public class Que2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(searchInRange(arr, 2, 4, 1));


    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
