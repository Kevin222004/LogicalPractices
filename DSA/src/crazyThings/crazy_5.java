/*

5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

*/

package crazyThings;

public class crazy_5 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int j = 1;
            int condition = (i > n) ? 2*n-i : i;
            for ( ; j <= condition; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

