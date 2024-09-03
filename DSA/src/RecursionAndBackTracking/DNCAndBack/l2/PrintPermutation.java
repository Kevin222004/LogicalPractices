/*

print all the permutaytion of string



*/
package RecursionAndBackTracking.DNCAndBack.l2;

public class PrintPermutation {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        printpermutation(arr, 0);
    }

    static void printpermutation(char[] str, int i) {
        if (i >= str.length) {
            System.out.println(str);
            return;
        }

        for (int j = i; j < str.length; j++) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            // recursion
            printpermutation(str, i + 1);

            // backtracking logic to re create the original string
            char temp2 = str[i];
            str[i] = str[j];
            str[j] = temp2;
        }

    }
}
