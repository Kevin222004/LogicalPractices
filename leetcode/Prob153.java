package leetcode;

public class Prob153 {
    public static void main(String[] args) {
//        int[] arr  = {4,5,6,7,0,1,2};
//        int[] arr = {3,4,5,1,2};
        int[] arr = {2, 3, 4, 5, 1};
        Solution153 sol = new Solution153();
        System.out.println(sol.findMin(arr));
    }
}

class Solution153 {
    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && num[mid] < num[mid - 1]) {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return num[start];
    }
}
