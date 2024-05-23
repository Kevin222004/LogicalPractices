package Recursion.l4;

import java.util.ArrayList;
import java.util.List;

public class MinimumElementRequireToGetTarget {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2); int target = 5;
        int ans = solve(list, target);
        System.out.println(ans);
    }

    static int solve(List<Integer> list, int target) {
        if (target == 0) {
            return 0;
        }
        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        int minValue = Integer.MAX_VALUE;
        for (int i =0 ; i < list.size(); i++) {
            int ans = solve(list, target-list.get(i));
            if (ans != Integer.MAX_VALUE) {
                minValue = Math.min(minValue, ans + 1);
            }
        }

        return minValue;
    }

}
