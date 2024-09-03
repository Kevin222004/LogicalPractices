/*

integer given n which shows the length of rod
maximum no segment you can make of this rod provided that
each segment should be of length X, Y, Z

*/

package RecursionAndBackTracking.l4;

public class cutIntoSegments {
    public static void main(String[] args) {
        int n = 7;
        int x = 5, y = 2, z = 2;
        System.out.println(maxSegment(n, x, y, z));
    }

    static int maxSegment(int n, int x, int y, int z) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }
        int ans1 = maxSegment(n - x, x, y, z) + 1;
        int ans2 = maxSegment(n - y, x, y, z) + 1;
        int ans3 = maxSegment(n - z, x, y, z) + 1;

        int ans = Math.max(ans1, Math.max(ans2, ans3));
        if (ans == Integer.MIN_VALUE) {
            return 0;
        }
        return ans;
    }
}
