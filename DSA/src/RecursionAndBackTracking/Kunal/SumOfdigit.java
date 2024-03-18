// f(n) = f(N/10) + n%10
// for example of n = 1234 then
// remainder = n % 10 = 4
// then we got 4 which we add in sum
//and we have to make 1234 to 123
// n = n/10
// simple and if n = 0 then return 0

package RecursionAndBackTracking.Kunal;

public class SumOfdigit {
    public static void main(String[] args) {
        int num = 1234;
//        System.out.println(1234%10);
        System.out.println("Sum of Digit: " + sumOfDigit(num));
    }

    static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }

        return (num%10) + sumOfDigit(num/10);
    }
}
