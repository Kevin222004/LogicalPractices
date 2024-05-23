package Recursion.l4;

public class cutIntoSegment {
    public static void main(String[] args) {
        int n = 7;
        int x  = 5;
        int y = 2;
        int z = 2;
        System.out.println(cut(n, x, y, z));
    }

    static int cut(int n, int x, int y, int z) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }

        int ansx = cut(n-x, x, y, z)+1;
        int ansy = cut(n-y, x, y, z)+1;
        int ansz = cut(n-z, x, y, z)+1;
        return Math.max((Math.max(ansx, ansy)), ansz);
    }
}
