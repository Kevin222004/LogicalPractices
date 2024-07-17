/*

15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *


 */
package Patterns;

public class crazy_15 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int spacelogic = (i>n) ? i -n : n-i;
            for (int space = 1; space <= spacelogic; space++) {
                System.out.print(" ");
            }

            // printlogic
            int printlogic = (i > n) ? (((2*n) - i) + (2*n-i-1)) : (2*i) -1 ;
            for (int print = 1; print <= printlogic; print++) {
                if (print == 1 || print == printlogic) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
















