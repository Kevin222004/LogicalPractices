/*

please do dry run many times when you do sort of revision


   permutation of string

   string str = "abc"

   all permutation = {abc, bac, bca, cab, cba, acb}

   the solution which has been written as string in that the string
   evry time is passed is new so backtrscking wont come in scenatio
   because
   watch babbar video DNC l2 timestamp ;- 1:44

   if this is been done by char array then you see the back trackng

*/
package RecursionAndBackTracking.back;

import java.util.Arrays;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        int i = 0;
//        getAllPermutations(str, i);

        char[] arr = str.toCharArray();
        getAllPermutations(arr, i);
    }

    static void getAllPermutations(String str, int i) {
        if (i >= str.length()) {
            System.out.println(str);
            return;
        }

        // swapping
        for (int j = i; j < str.length(); j++) {
            String swappedString = swapChars(str, i, j);
            getAllPermutations(swappedString, i+1);
        }
    }
    private static String swapChars(String str, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }


    static void getAllPermutations(char[] str, int i) {
        if (i >= str.length) {
            System.out.println(str);
            return;
        }

        // swapping
        for (int j = i; j < str.length; j++) {
            // swap
            swapChar(str, i, j);
            // recursion
            getAllPermutations(str, i+1);
            // backtracking to recreate the input
            swapChar(str, i, j);
        }
    }

    static void swapChar(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
