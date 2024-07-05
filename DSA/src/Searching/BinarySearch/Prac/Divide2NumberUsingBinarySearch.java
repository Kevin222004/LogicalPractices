/*

Divide 2 number using BinarySearch
divident = 10;
divisor = 2;
quotient = ?

How to do it

*/

package Searching.BinarySearch.Prac;

public class Divide2NumberUsingBinarySearch {
    public static void main(String[] args) {
        int divident = 12;
        int divisor = 2;
        int quotient = findQuotientUsingBinarySearch(divident, divisor);
        System.out.println(quotient);
    }

    // This solution require minor mofdification not enough
    static int findQuotientUsingBinarySearch(int divident, int divisor) {
        int ans = -1;
        int start = 0;
        int end = divident;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            int formula = divisor * mid;

            if (formula == divident) {
                ans = mid;
                break;
            }
            if  (formula > divident) {
                end = mid - 1;
            }
            else {
                ans = mid;
                start = end + 1;
            }
        }


        return ans;
    }
}
