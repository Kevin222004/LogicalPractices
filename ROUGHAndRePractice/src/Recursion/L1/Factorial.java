package Recursion.L1;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + factoial(n));
    }

    public static int factoial(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        // recursive relation
        return n * factoial(n-1);
    }
}
