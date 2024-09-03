/*

Union of 2 Array

two array as input and so union means put all the element in ans array

*/
package DSA.src.Arrays.ArrayClass2;

import java.util.ArrayList;
import java.util.List;

public class UnionElement {

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(15);
        arr1.add(41);
        arr1.add(13);
        arr1.add(2);
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(51);
        arr1.add(135);
        arr1.add(441);
        arr1.add(133);
        arr1.add(222);
        System.out.println(UnionArray(arr1, arr2));
    }

    // assumeed no duplicate
    public static List<Integer> UnionArray(List<Integer> arr1, List<Integer> arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.size() + arr2.size(); i++) {
            if (arr1.size() >= i) {
                ans.add(arr1.get(i));
            } else {
                ans.add(arr2.get(i));
            }
        }

        return ans;
    }


}


