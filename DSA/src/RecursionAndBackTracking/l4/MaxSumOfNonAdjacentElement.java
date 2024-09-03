/*

There is an array and there are elemnts in it
ip -> 2, 1, 4, 9
find nonadjusent elemnt some how the sum will be maximum
Return the maximum sum of subsequence in ehich no of two element are adjacent

*/

package RecursionAndBackTracking.l4;

public class MaxSumOfNonAdjacentElement {
    public static void main(String[] args) {
        int[] arry = {2, 1, 4, 9};
        int i = 0;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        System.out.println(maxSumOfNonAdjElem(arry, sum, maxi, i));

    }

    static int maxSumOfNonAdjElem(int[] arr, int sum, int maxi, int i) {
        if (i >= arr.length) {
            return Math.max(sum, maxi);
        }

        // include
        int inc = maxSumOfNonAdjElem(arr, sum + arr[i], maxi, i + 2);
        // exclude
        int exc = maxSumOfNonAdjElem(arr, sum, maxi, i + 1);
        return Math.max(inc, exc);
    }
}
