package Array;

public class Extremeprint {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        ExtremePrint(arr);

    }
    static void ExtremePrint(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            System.out.print(arr[s] + " " + arr[e] + " ");
            s++;
            e--;
        }
    }
}
