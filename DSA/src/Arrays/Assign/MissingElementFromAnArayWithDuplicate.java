package Arrays.Assign;

import java.util.Map;

public class MissingElementFromAnArayWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.MissingELe(arr));
    }
}

class Solution {
     public int MissingELe(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             int index = Math.abs(arr[i] - 1);
             if (arr[index - 1] > 0) {
                 arr[index - 1] = -1 * arr[index - 1];
             }
         }

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > 0) {
                 return arr[i];
             }
         }
         return -1;
     }
}