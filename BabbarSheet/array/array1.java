/*

https://www.geeksforgeeks.org/problems/reverse-sub-array5620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

 */

package BabbarSheet.array;
import java.util.*;

public class array1 {
}

class Solution1 {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        // code here
        int i = l-1;
        int j = r-1;
        while (i<= j) {
            int t = arr.get(j);
            int tj = arr.get(i);
            arr.set(i, t);
            arr.set(j, tj);
            i++;
            j--;
        }

        return arr;
    }
}
