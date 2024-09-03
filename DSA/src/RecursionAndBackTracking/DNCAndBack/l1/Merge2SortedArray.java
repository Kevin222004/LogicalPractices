/*

Their are 2 sorted array Merge them.


*/
package RecursionAndBackTracking.DNCAndBack.l1;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {3, 5, 7, 9, 11};

    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr2.length + arr1.length];
        int i = 0, k = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
