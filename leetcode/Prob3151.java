package leetcode;

/*

leetcode 3151

 */
public class Prob3151 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 1, 4};
        System.out.println(solution.isArraySpecial(arr));
    }

}

class Solution {
    public boolean isArraySpecial(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        else {
            for (int i = 1 ; i < arr.length; i++) {
                if (arr[i-1] % 2 == 0 && arr[i] % 2 != 0) {
                }
                else if (arr[i-1] % 2 != 0 && arr[i] % 2 == 0) {
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}