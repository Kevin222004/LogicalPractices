/*

Print All SubArray Using

{1,2,3,4,5} ---> {1},{1,2}.{1,2,3}....



*/
package RecursionAndBackTracking.Assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllSubArrayUsingRE {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        subArray(list, ans, 0);
        System.out.println(ans);
    }

    static void subArray(List<Integer> list,List<List<Integer>> ans, int pointer) {


    }
}
