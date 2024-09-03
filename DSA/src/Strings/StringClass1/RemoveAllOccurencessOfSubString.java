// https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

package Strings.StringClass1;

public class RemoveAllOccurencessOfSubString {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        int lastIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != part.charAt(i)) {
                str.append(s.charAt(i));
                lastIndex++;
            } else {

            }
        }

        return str.toString();
    }
}
