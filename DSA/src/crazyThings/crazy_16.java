/*

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

 */
package crazyThings;

import java.util.*;

public class crazy_16 {
    public static void main(String[] args) {
//        System.out.println(printPascal(5));
        List<List<Integer>> ans = printPascal(5);
        for (int i = 0; i < ans.size(); i++) {
            int spaceLogic = ans.size()-i;
            for (int space = 0; space < spaceLogic; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> printPascal(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    temp.add(1);
                } else {
                    int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                    temp.add(val);
                }
            }

            ans.add(temp);
        }

        ans = ans.subList(1, ans.size());
        return ans;
    }
}
