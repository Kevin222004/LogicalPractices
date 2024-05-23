package Recursion.L1;

public class Counting {
    public static void main(String[] args) {
        int n = 5;
        printCoutinting2(n);
    }

    static void printCoutinting(int n) {
        // basecase
        if (n == 0) {
            return;
        }
        // processing
        System.out.println(n);
        // recursive relation
        printCoutinting(n-1);
    }

    static void printCoutinting2(int n) {
        // basecase
        if (n == 0) {
            return;
        }
        // recursive relation
        printCoutinting2(n-1);

        // processing
        System.out.println(n);
    }
}
