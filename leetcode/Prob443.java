package leetcode;

import java.util.Arrays;

public class Prob443 {
    public static void main(String[] args) {
        Solution443 sol = new Solution443();
        char[] arr = {'a','a','b','b','c','c', 'c'};
        System.out.println(sol.compress(arr));
        System.out.println(Arrays.toString(arr));
    }
}

class Solution443 {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int i = 0; int j = i+1;
        while (j < chars.length) {
            if (chars[i] != chars[j]  ) {
                str.append(chars[i]);
                i++;
                j++;
            }
            else {
                int count = 1;
                while (j <chars.length &&chars[i] == chars[j]) {
                    count++;
                    j++;
                }
                str.append(chars[i]).append(count);
                i = j;
                j = j + 1;
            }
        }

        char[] arr1 = str.toString().toCharArray();
        chars = Arrays.copyOf(str.toString().toCharArray(), str.length());

        return chars.length;
    }
}
