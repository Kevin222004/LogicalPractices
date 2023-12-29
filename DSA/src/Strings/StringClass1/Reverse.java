package Strings.StringClass1;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str = "Kevin";
        System.out.println(reverseString(str));
        System.out.println(("Ke v i n "));
        System.out.println(repalceSpaces("Ke v i n "));
    }

    static String reverseString(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        return Arrays.toString(ch);
    }

    static String repalceSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) != ' ') {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
