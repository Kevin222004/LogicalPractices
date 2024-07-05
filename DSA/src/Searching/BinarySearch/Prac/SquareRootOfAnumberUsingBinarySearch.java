package Searching.BinarySearch.Prac;

public class SquareRootOfAnumberUsingBinarySearch {
    public static void main(String[] args) {
        int Square = 37;
        System.out.println("Square Root is :- " + squareRootUsingBinarySearch(Square));
        System.out.println();
        System.out.println("=======================================+");
        System.out.println();
        double step = 0.1;
        int ans = squareRootUsingBinarySearch(Square);
        double an = 0;
        for (int i = 0; i < 2; i++) {
            for (double j = ans; j*j<=Square; j = j + step) {
                an = j;
            }
            step = step/10;

        }
        System.out.println(an );
    }

    // babbar slgo is slight different
    static int squareRootUsingBinarySearch(int x) {
        int ans = -1;

        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start)/2;
            int multi = mid * mid;
            if (multi == x) {
                ans = mid;
                break;
            }
            else if (multi > x) {
                end = mid - 1;
            }
            else if (multi < x) {
//                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }
}
