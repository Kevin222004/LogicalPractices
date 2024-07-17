package RecursionAndBackTracking.Assign;

public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("kevin");
        System.out.println(str.toString());
        reverseAStringUsingRE(str, 0, 4);
        System.out.println(str.toString());
    }

    static void reverseAStringUsingRE(StringBuilder str, int s, int e) {
        if (s >= e) {
            return;
        }

        char temp = str.charAt(s);
        str.setCharAt(s, str.charAt(e));
        str.setCharAt(e, temp);

        reverseAStringUsingRE(str, s+1, e-1);
    }
}
