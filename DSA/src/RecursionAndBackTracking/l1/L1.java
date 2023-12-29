/*
Recursion

3 Mandatory Step

1) Base case --> when code needs to be stop

2) Recursive relation --> for this code - ans = n * f(n-1)

3) processing --> optional some extra logic


What is Head Recursion and Tail Recursion?
if processing is done before the recursive relation then it is Tail Recursion
----------------------------
    Tail Recursion         |
     -------               |
   Base case               |
                           |
   Processing              |
                           |
  Recursive relation       |
                           |
                           |
---------------------------
                           |
    Head Recursion         |
    ---------              |
                           |
   Base case               |
                           |
  Recursive relation       |
                           |
   Processing              |
                           |
----------------------------


//////////////////////////////////////////////////////////

1 Magical line of Recursion

1 case solve karlo baki recursion sambhal lega









*/

package RecursionAndBackTracking.l1;

public class L1 {
    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        printCountingRevrese(10);
//        printCounting(10);
        System.out.println(fibonacci(8));
    }


    static int factorial(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    static void printCountingRevrese(int n) {
        // base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printCountingRevrese(n-1);
    }

    static void printCounting(int n) {
        // base case
        if (n == 0) {
            return;
        }
        printCounting(n-1);
        System.out.println(n);
    }

    static int fibonacci(int n) {
        if (n == 1 ) {
            return 0;
        }
        if (n==2) {return 1;}
        int ans = fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }
}
