/*

11.  * * * * *
      * * * *
       * * *
        * *
         *


*/

package crazyThings;

public class crazy_11 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = n; i >= 1; i--) {
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