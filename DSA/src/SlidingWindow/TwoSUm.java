/*

2 variable approach


https://leetcode.com/problems/two-sum/

*/

package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TwoSUm {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        List<pair> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            pair p = new pair(val, i);
            list.add(p);
        }
        list.sort(Comparator.comparingInt(p -> p.data));
        int i = 0;
        int j = list.size() - 1;

        while (i <= j) {
            int sum = list.get(i).data + list.get(j).data;
            if (sum == target) {
                return new int[]{list.get(i).index, list.get(j).index};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }

    static class pair {
        int data;
        int index;

        public pair(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }
}
