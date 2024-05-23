/*
this problem is called as coin change problem

In input  their is array of size n  which is distinct element
and target is 5
know you have to tell minimum number on element required to reach target

*/

package RecursionAndBackTracking.l4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumElementToAcquireTarget {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); list.add(1);list.add(2);
        int target = 5;
        int ans = solve(list, target);
        System.out.println(ans);
    }

//    minimum wala case
    static int solve(List<Integer> list, int target) {
        // base case
        if (target == 0) {
            return 0;
        }
        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int ans = solve(list, target-list.get(i));
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1);
            }
        }

        return mini;
    }
}
