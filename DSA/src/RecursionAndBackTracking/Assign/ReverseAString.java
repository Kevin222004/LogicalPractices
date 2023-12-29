/*

Reverse a string using recursion

*/

package RecursionAndBackTracking.Assign;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Kevinpatel";
        int start = 0, end = str.length()-1;
        System.out.println(PrintReverseString(str.toCharArray(), start, end));
    }

    static String PrintReverseString(char[] str, int start, int end) {
        if (start>=end) {
            StringBuilder sb = new StringBuilder();
            for (char c : str) {
                sb.append(c);
            }
            return sb.toString();
        }
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        return PrintReverseString(str,  start+1, end-1);
    }
}
