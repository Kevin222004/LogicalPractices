/*

9.  *********
     *******
      *****
       ***
        *


*/

package Patterns;

public class crazy_9 {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        for (int i = n; i > 0; i--) {
            for (int space = 1; space <= (n - i); space++) {
                System.out.print(" ");
            }

            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}