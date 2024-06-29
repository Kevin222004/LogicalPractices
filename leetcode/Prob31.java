package leetcode;

import java.util.Arrays;

public class Prob31 {
    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        int[] arr = {2, 3, 1};
        sol.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution31 {
    public void nextPermutation(int[] arr) {

        int i = arr.length-1;
        int index = -1;

        while (i > 0) {
            if (arr[i-1] < arr[i]) {
                index = i-1;
                break;
            }
            i--;
        }
        if (index == -1) {
            int s = 0;
            int e = arr.length-1;
            while (s <=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] =temp;
                s++;
                e--;
            }
            return;
        }
        int min = Integer.MAX_VALUE; int index2 = 0;
        for (int j = index+1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {
            min = Math.min(min, arr[j]); index2 = j;
            }

        }
        int temp = arr[index];
        arr[index] = min;
        arr[index2] = temp;

        int s = index+1;
        int e = arr.length-1;
        while (s <=e) {
            int temp2 = arr[s];
            arr[s] = arr[e];
            arr[e] =temp2;
            s++;
            e--;
        }
    }
}