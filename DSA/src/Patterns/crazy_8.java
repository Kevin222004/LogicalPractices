/*

8.      *
       ***
      *****
     *******
    *********


*/

package Patterns;

public class crazy_8 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

