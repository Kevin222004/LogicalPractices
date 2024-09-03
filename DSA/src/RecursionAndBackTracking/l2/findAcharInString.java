package RecursionAndBackTracking.l2;

public class findAcharInString {
    public static void main(String[] args) {
        String str = "Kevin";
        int n = str.length();
        char key = 'v';
        System.out.println(checkKey(key, str, 0, n));
    }

    static boolean checkKey(char key, String str, int i, int length) {
        if (i >= length) {
            return false;
        }
        if (str.charAt(i) == key) {
            return true;
        }

        return checkKey(key, str, i + 1, length);
    }
}
