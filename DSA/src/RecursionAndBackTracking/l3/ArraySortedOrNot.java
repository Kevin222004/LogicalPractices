package RecursionAndBackTracking.l3;

public class ArraySortedOrNot {

    public static void main(String[] args) {
        int[] arr = {4,3,1,2,4,4};

        System.out.println(isSorted(arr, 1));
    }

    static boolean isSorted(int[] arr, int i) {

        if (i >= arr.length) {
            return true;
        }

        if (arr[i] >= arr[i-1]) {
           return isSorted(arr, i+1);
        }
        else {
            return false;
        }
    }

}
