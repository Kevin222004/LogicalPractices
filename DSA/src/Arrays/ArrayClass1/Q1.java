package Arrays.ArrayClass1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr2 = {1, 2, 3, 5, 7};

        int[] arr = new int[5];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int j : arr) {
//            System.out.println(j * 2);
//        }

        System.out.println(Arrays.toString(changeValueTo1(arr2)));
    }

    public static int[] changeValueTo1(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] != 1) {
                arr[i] = 1;
            }
        }
        return arr;
    }


}