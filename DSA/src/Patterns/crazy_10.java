/*

10.      *
        * *
       * * *
      * * * *
     * * * * *

*/

package Patterns;

public class crazy_10 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
