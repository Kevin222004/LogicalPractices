package RecursionAndBackTracking.l2;

public class PrintDigitOfNumber {
    public static void main(String[] args) {
        PrintAllDigit(647);
    }

    static void PrintAllDigit(int n) {
        if (n == 0) {
            return;
        }
        int newValue = n / 10;
        PrintAllDigit(newValue);
        int digit = n%10;
        System.out.println(digit);
    }
}
