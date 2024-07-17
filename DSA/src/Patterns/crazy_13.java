/*

13.      *
        * *
       *   *
      *     *
     *********


*/

package Patterns;

public class crazy_13 {
    public static void main(String[] args) {
        print(5);
    }
    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n-i; sp++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2*i)-1; k++) {
                if (i == n){
                    System.out.print('*');
                }
                else  {
                    if (k == 1 || k == (2 * i) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
