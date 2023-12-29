// leetcode https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

package Strings.StringClass1;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeAllAdjacentDuplicatesInString(str));
    }

    static String removeAllAdjacentDuplicatesInString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0; int lastIndex = 0;
        while (i < str.length()) {
            if (i == 0) {stringBuilder.append(str.charAt(i)); lastIndex++;}
            else {
                if (lastIndex !=0 && stringBuilder.charAt(lastIndex-1) == str.charAt(i) ) {
                    stringBuilder.deleteCharAt(lastIndex-1);
                    lastIndex--;
                }
                else {
                    stringBuilder.append(str.charAt(i));
                    lastIndex++;
                }
            }
            i++;
        }

        return stringBuilder.toString();
    }
}
