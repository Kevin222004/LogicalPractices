package RecursionAndBackTracking.Assign;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubArraysUsingRe {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        printSubArray(nums);
    }

    static void printSubArray_Util(List<Integer> nums, int start, int end) {
        // base
        if (end == nums.size()) {
            return;
        }

        // 1 case sol
        for (int i = start; i <= end; i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        printSubArray_Util(nums, start, end + 1);
    }

    static void printSubArray(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            printSubArray_Util(nums, i, 0);
        }
    }
}