package practice.Searching;

public class SwuareRootUsingBinarySearch {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(squareRoot(num));

    }

    public static int squareRoot(int max) {
        int start = 1;
        int end = max;
        int ans  = -1;
        while (start < end) {
            int mid = start + (end - start)/2;
            int multi = mid*mid;
            if (multi == max) {
                return mid;
            }
            else if (multi < max) {
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
}
