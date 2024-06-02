package leetcode;

public class Prob1768 {
    public static void main(String[] args) {
        Solution1768 sol = new Solution1768();
        System.out.println(sol.mergeAlternately("Abc", "l"));

    }
}

class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder("");
        int p = 0;
        int q = 0;
        while (q < word2.length() || p< word1.length()) {
            while (q != word2.length() && p< word1.length()) {
                str.append(word1.charAt(p));str.append(word2.charAt(q));
                p++;
                q++;
            }

            while (p < word1.length()) {
                str.append(word1.charAt(p));
                p++;
            }

            while (q < word2.length()) {
                str.append(word2.charAt(q));
                q++;
            }
        }
        return str.toString();
    }
}
