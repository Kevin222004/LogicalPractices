package RecursionAndBackTracking.Assign;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(Palindrom("racecar", 0, 6));
        System.out.println(Palindrom("raceca", 0, 5));
    }

    static boolean Palindrom(String str, int s, int e) {
        // base case
        if (s >= e) {
            return true;
        }
        if (str.charAt(s) == str.charAt(e)) {
            return Palindrom(str, s + 1, e - 1);
        } else {
            return false;
        }
    }
}
