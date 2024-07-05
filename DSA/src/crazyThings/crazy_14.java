/*
14.  *********
      *     *
       *   *
        * *
         *

*/
package crazyThings;

public class crazy_14 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int i = n; i >= 1; i--) {
            for (int space = 0; space < (n-i); space++) {
                System.out.print(" ");
            }

            for (int print = 1; print <= (2*i)-1; print++) {
                if (i == n) {
                    System.out.print("*");
                }
                else {
                    if (print == 1 || print == (2*i)-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
