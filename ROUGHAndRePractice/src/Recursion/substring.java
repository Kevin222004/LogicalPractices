package Recursion;

public class substring {
    public static void main(String[] args) {
        substring("abc", new StringBuilder(), 0);
    }

    public static void substring(String s, StringBuilder o, int i) {
        if (i >= s.length()) {
            System.out.println(o.toString());
            return;
        }
        substring(s, o, i+1);
        substring(s, o.append(s.charAt(i)), i+1);
        o.deleteCharAt(o.length()-1);

    }
}
