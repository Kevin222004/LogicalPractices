/*

Remove all occurences of a subarray

https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

*/

package RecursionAndBackTracking.Assign;

public class RemoveAllOccurenceOfASubString {

    public static void main(String[] args) {
        String arr = "abbcbabcbaabcbbabc";
        String part = "abc";
        int found = arr.indexOf(part);
        System.out.println(found);
        String left = arr.substring(0, found);
        System.out.println(left);
        String right = arr.substring(found + part.length());
        System.out.println(right);
    }

    class Solution {
        public String removeOccurrences(String s, String part) {
            return strRemove(s, part);
        }

        String strRemove(String arr, String part) {
            int found = arr.indexOf(part);

            if (found >= 0) {
                // part string has been located
                // please remove it
                String left = arr.substring(0, found);
                String right = arr.substring(found + part.length());
                String ans1 = left + right;
                return strRemove(ans1, part);
            }
            return arr;
        }
    }
}
