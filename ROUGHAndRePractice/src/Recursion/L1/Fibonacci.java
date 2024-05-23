package Recursion.L1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

    public static int fact(int n) {
        // base case
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        // Recursive relation
        int ans = fact(n-1) + fact(n-2);
        return ans;
    }
}
