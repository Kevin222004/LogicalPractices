/*

https://leetcode.com/problems/wildcard-matching/

https://www.youtube.com/watch?v=OgovJ9CB0hI

*/

package RecursionAndBackTracking.Assign;

public class WildCardMatchingPattern {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isMatch(String s, String p) {
            return solveUsingRecursion(s, p, s.length()-1, p.length()-1);
        }

        boolean solveUsingRecursion(String str, String pattern, int i, int j) {
            // base case
            if (i < 0 && j < 0) {
                return true;
            }
            if (i >= 0 && j < 0) {
                return false;
            }

            if (i < 0 && j >= 0) {
                for (int k = 0; k <= j; k++) {
                    if (pattern.charAt(k) != '*') {
                        return false;
                    }
                }
                return true;
            }

            if (str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?') {
                return solveUsingRecursion(str, pattern, i-1, j-1);
            }
            else if (pattern.charAt(j) == '*') {
                return solveUsingRecursion(str, pattern, i-1, j) ||solveUsingRecursion(str, pattern, i, j-1);
            }
            else {
                return false;
            }
        }
    }

}
