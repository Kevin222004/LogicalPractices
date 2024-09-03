/*
LeetCode :- 75
SortColor Problem
This is the smae that sort an array of 0 1 and 2
for example :- Input ->  2 0 2 1 1 0
               output -> 0 0 1 1 2 2


Approach :-

method-1 --> Sort All The Element

method-2 --> Counting Method (count all the 0, 1 and 2 and modify the existing array accordingly the count of 0 1 and 2)


*/

package Arrays.ArrayClass3;

import java.util.Arrays;

public class Sort0s1sand2s1DArray {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(SortColor(arr)));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    // method-2 counting Method, This is not inplace solution as mentioned in leetcode;
    static int[] SortColor(int[] arr) {
        int countOfZero = 0;
        int countOfOne = 0;
        int countOfTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countOfZero++;
            } else if (arr[i] == 1) {
                countOfOne++;
            } else {
                countOfTwo++;
            }
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (countOfZero != 0) {
                ans[i] = 0;
                countOfZero--;
            } else if (countOfOne != 0) {
                ans[i] = 1;
                countOfOne--;
            } else {
                ans[i] = 2;
                countOfTwo--;
            }
        }
        return ans;
    }

    // method-2 counting Method, InPlace solution, 3-pointer Approach
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int hig = nums.length - 1;
        while (mid <= hig) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[hig];
                nums[hig] = temp;
                hig--;
            }
        }
    }

}
