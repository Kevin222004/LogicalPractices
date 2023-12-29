/*

last occurence of a char using recursion

lets suppose their is a String
intput string = abcddefg find the last occurence of the d


*/

package RecursionAndBackTracking.Assign;

public class lastOccurence {

    public static void main(String[] args) {
        String str = "abcddefg";
        char target = 'g';
        int maxval = Integer.MIN_VALUE;
        int lastOccurence = lastOccuerence(str,target, maxval,0);
        System.out.println(lastOccurence);
    }

    static int lastOccuerence(String str,char target,int maxval, int index) {
        if (index >= str.length()) {
            return maxval;
        }
        if (str.charAt(index) == target) {
            maxval = index;
        }
        return lastOccuerence(str, target, maxval, index+1);
    }

}
