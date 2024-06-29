package Recursion;

public class bs {
    public static void main(String[] args) {
        int[] arr = {2, 4, 22, 43, 44, 244, 442};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(BinarySearch(arr, 0, arr.length-1, arr[i]));
//        }
        System.out.println(BinarySearch(arr, 0, arr.length-1, 909));
    }

    public static int BinarySearch(int[] arr, int s, int e, int target) {
        if ( s >= arr.length || e >= arr.length) {
            return -1;
        }
        int m = (s + e) /2;
        if (arr[m] == target) {
            return m;
        }
        else if (target < arr[m]) {
            return BinarySearch(arr, s, m - 1, target);
        }
        else {
            return BinarySearch(arr, m + 1, e , target);
        }
    }

}

