package Arrays.ArrayClass1;

public class  ReverseArray {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int a = 9;

        //        Arrays.ArrayClass1.ReverseArray(arr);
        //        ReverseArrayUsingSwap(arr);
    }

    public static void ReverseArray(int[] arr) {
        for (int i=0; i< arr.length; i ++) {
            int j = arr.length - i - 1;
            System.out.print(arr[j] + " ");
        }
    }

    public static void ReverseArrayUsingSwap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - i -1;

            if (i >= j) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


}
