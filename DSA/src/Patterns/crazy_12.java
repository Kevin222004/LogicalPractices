/*

12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


*/

package Patterns;

public class crazy_12 {
    public static void main(String[] args) {
        printuseless(5);
//        print(5);
    }

    // 1st way a good way
    static void print(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int spaceCondition = (i > n) ? (2*n) - i + 1  : (i-1);
            for (int s = 1; s<=spaceCondition;s++) {
                System.out.print(" ");
            }

            int printCondition = (i < n) ? n : (2*n-i);
            for (int k = 1; k <= printCondition; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

// ----------------------------------------------------------------------------------------------

    //2nd way mm.. not good
    public static void printuseless2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n-i);k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i;j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }

    public static void printuseless(int n) {
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
        printuseless2(5);

    }

//    -------------------------------------------------------------------------
}
