/*

In an array, arr, the elements at indices i and j (where i < j ) form an inversion if (arr[i] > arr[j]) .
In other words, inverted elements arr[i] and arr[j] are considered to be "out of order". To correct an inversion, we can swap adjacent elements.

Example

arr = [2, 4, 1]

To sort the array, we must perform the following two swaps to correct the inversions:

arr = [2, 4, 1] swap(arr[1], arr[2]) -> swap(arr[0], arr[1]) [1, 2, 4]

The sort has two inversions: (4, 1) and (2, 1).
Given an array , return the number of inversions to sort the array.

Function Description

Complete the function countInversions in the editor below.

countInversions has the following parameter(s):

int arr[n]: an array of integers to sort
Returns

int: the number of inversions
Input Format

The first line contains an integer, d, the number of datasets.

Each of the next d pairs of lines is as follows:

The first line contains an integer, n , the number of elements in arr.
The second line contains n space-separated integers, arr[i].
Constraints

Sample Input
1 <= d <= 15
1 <= n <= 10^3
1 <= arr[i] <= 10^7


STDIN       Function
-----       --------
2           d = 2
5           arr[] size n = 5 for the first dataset
1 1 1 2 2   arr = [1, 1, 1, 2, 2]
5           arr[] size n = 5 for the second dataset
2 1 3 1 2   arr = [2, 1, 3, 1, 2]
Sample Output

0
4

*/

package RecursionAndBackTracking.Assign;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        System.out.println(countInversion(arr));

    }

    // method 1
    static int countInversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // method 2

}
