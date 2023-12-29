/*

Given String s = daabcbaabcbc, part "abc"
remove all occurences of abc

Approach will be
1) Find part String position in s
2) Remove part  from s
3) call again the func for new string

*/

package RecursionAndBackTracking.Assign;

public class RemoveAllOccurrencesOfASubarray {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }

    public static String removeOccurrences(String s, String part) {
        return strRemove(s, part);
    }

    static String strRemove(String arr, String part) {
        int found = arr.indexOf(part);

        if (found >= 0) {
            // part string has been located
            // please remove it
            String left = arr.substring(0, found);
            String right = arr.substring(found + part.length());
            String ans1 = left + right;
            return strRemove(ans1, part);
        }
        return arr;
    }
}
