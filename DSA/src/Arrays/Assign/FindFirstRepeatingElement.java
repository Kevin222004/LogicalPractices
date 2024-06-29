/*

Given an array of size n find the first repating element. The element should occur more than once and the index of its first occurence should be the smallest
int[] arr = 1, 5, 3, 4, 3, 5, 6
so the first repating element in above array is 5 which repat 2 time and first occurence is at 2
(Assume index start from 1 not from 0)
time complexity O(n)
space complexity O(n)

1st approach brute force
pick 1 element search entire array wther it is present or not time complexoty o(n^2)

2nd approach
if we store some where that 1 -> 1 // this storing is called hashing
                            5 -> 2
                            3 -> 2
                            4 -> 1
                            6 -> 1
so we can do it in O(n)

*/

package Arrays.Assign;

import java.util.HashMap;

public class FindFirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(findFirstRepeatingElement(arr));
    }

    public static int findFirstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.replace(arr[i], hash.get(arr[i])+1);
            }
            else {
                hash.put(arr[i], 1);
            }
        }

        for (int j : arr) {
            if (hash.get(j) > 1) {
                return j;
            }
        }
        return -1;
    }
}