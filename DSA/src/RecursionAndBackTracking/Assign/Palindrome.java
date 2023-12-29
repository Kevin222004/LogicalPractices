/*

palindrom using recursion

*/

package RecursionAndBackTracking.Assign;

public class Palindrome {
    public static void main(String[] args) {
        String s = "KeveK";
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }

    static boolean isPalindrome(String str, int start, int end) {
        // base case
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {return false;}

        return isPalindrome(str, start + 1, end - 1);
    }
}
