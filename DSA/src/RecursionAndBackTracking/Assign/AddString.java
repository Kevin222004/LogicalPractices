/* solution no complete using recursion */
///*
//
//LeetCode 415.Add Strings
//
//Their are 2 String 1) str1 = "1234" 2) str2 = "1234"
//know the answer should be ans = "2468";
//you can't convert this into integer can't use in built funciton
//
//we will do this with recursion
//
//*/
//
//package RecursionAndBackTracking.Assign;
//
//public class AddString {
//    public static void main(String[] args) {
//        String num1 = "1234";
//        String num2 = "1234";
//        Solution solution = new Solution();
//        System.out.println(solution.addStrings(num1, num2));
//    }
//
//
//}
//class Solution {
//    public String addStrings(String num1, String num2) {
//        return addRe(num1, num1.length()-1, num2, num2.length()-1, 0);
//    }
//
//    String addRe(String num1, int p1, String num2, int p2, int carry) {
//
//        // base case
//
//        if (p1 <0 && p2 < 0) {
//            if (carry != 0) {
//                return String.valueOf(carry + '0');
//            }
//            return "";
//        }
//
//        // 1st case solve karo
//        int n1 = (p1 > 0 ? num1.charAt(p1) : '0') - '0';
//        int n2 = (p2 > 0 ? num1.charAt(p2) : '0') - '0';
//        int cSum = n1 + n2 + carry;
//        int digit = cSum % 10;
//        carry = cSum / 10;
//        String ans = "";
//        ans = ans + (digit + '0');
//
//        ans += addRe(num1, p1-1, num2, p2-1, carry);
//        return ans;
//    }
//}