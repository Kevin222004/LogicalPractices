/*

4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

*/

package crazyThings;

public class crazy_4 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
