package leetcode;

public class Prob34 {
}

class Solution34 {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
            || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                temp.append(s.charAt(i));
                str.append('.');
            }
            else {
                str.append(s.charAt(i));
            }
        }

        for (int i= 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                str.deleteCharAt(i);
                str.insert(i , temp.charAt(temp.length()-1));
                temp.deleteCharAt(temp.length()-1);

            }
        }

        return str.toString();
    }
}
