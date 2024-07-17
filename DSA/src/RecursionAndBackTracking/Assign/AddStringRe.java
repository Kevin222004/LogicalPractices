// https://leetcode.com/problems/add-strings/description/
package RecursionAndBackTracking.Assign;

public class AddStringRe {
    class Solution {
        public String addStrings(String num1, String num2) {
            return ans(num1, num2, num1.length() - 1, num2.length() - 1, 0, new StringBuilder());
        }

        String ans(String num1, String num2, int i1, int i2, int carry, StringBuilder totalSum) {
            if (i1 < 0 && i2 < 0 && carry == 0) {
                return totalSum.reverse().toString();
            }

            int sum = carry;
            if (i1 >= 0) {
                sum += num1.charAt(i1) - '0';
            }
            if (i2 >= 0) {
                sum += num2.charAt(i2) - '0';
            }

            carry = sum / 10;
            totalSum.append(sum % 10);

            return ans(num1, num2, i1 - 1, i2 - 1, carry, totalSum);
        }
    }


    class Solution2 {
        public String addStrings(String num1, String num2) {
            StringBuilder str = new StringBuilder();

            int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

            while (i >= 0 || j >= 0 || carry > 0) {
                int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
                int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

                sum = digit1 + digit2 + carry;
                str.append(sum % 10);
                carry = sum / 10;
            }

            return str.reverse().toString();
        }
    }
}
