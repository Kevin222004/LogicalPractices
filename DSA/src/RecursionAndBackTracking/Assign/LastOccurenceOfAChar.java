// string given
// ex abcddefg
// char given d
// now tell the last occurence of d in the string
package RecursionAndBackTracking.Assign;

public class LastOccurenceOfAChar {
    public static void main(String[] args) {
        String str = "abcddefg";
        char chr = 'g';
        System.out.println(lastOccu(str, chr, str.length()-1, -1));
    }

    static int lastOccu(String str, char chr, int index, int ans) {
        if (index < 0) {
            return -1;
        }

        if (str.charAt(index) == chr) {
            return index;
        }

        return lastOccu(str, chr, index-1, ans);
    }

}


