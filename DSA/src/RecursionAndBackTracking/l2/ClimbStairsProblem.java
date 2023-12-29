/*

lets suppose you have n stairs

you are at 0th stand you have to reach at nth stair
but step allowed are
       |
       -----> 1 stair at a time
       |
       -----> 2 Stair at a time

find no of ways to reach nth stair

f

*/

package RecursionAndBackTracking.l2;

import java.util.Scanner;

public class ClimbStairsProblem {

    public static void main(String[] args) {

        int nthStair;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth Stair");
        nthStair = sc.nextInt();
        System.out.println(totalWaysToClimb(nthStair));
    }

    static int totalWaysToClimb(int n) {

        if (n==1 || n==0) {
            return 1;
        }

        return totalWaysToClimb(n-1) + totalWaysToClimb(n-2);
    }
}
