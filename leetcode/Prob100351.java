package leetcode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Prob100351 {
}

class Solution100351 {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = i + 1;

        while (j < s.length()) {
            if (getInt(String.valueOf(s.charAt(i))) % 2 == 0 && getInt(String.valueOf(s.charAt(j))) % 2 == 0) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                list.add(parseInt((String.copyValueOf(arr))));
                char tempw = arr[i];
                arr[i] = arr[j];
                arr[j] = tempw;
            }
            i++;
            j++;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k< list.size(); k++) {
            ans = Math.min(list.get(k), ans);
        }
        if (ans == Integer.MAX_VALUE) {
            return s;
        }
        return String.valueOf(ans);
    }

    int getInt(String s) {
        return parseInt(s);
    }

}
