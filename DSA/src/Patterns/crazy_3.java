/*

3.  *****
    ****
    ***
    **
    *

*/

package DSA.src.Patterns;

public class crazy_3 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

