// Search in String
package Searching.LinearSearch;

public class Que1  {
    public static void main(String[] args) {
        System.out.println(SearchInString("Kevin", 'K'));
        System.out.println(SearchInString("tomJerry", 'y'));
    }

    static int SearchInString(String str, char charToSearch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToSearch) {
                return i;
            }
        }
        return -1;
    }

}


