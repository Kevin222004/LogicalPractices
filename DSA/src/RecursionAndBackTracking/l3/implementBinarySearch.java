package RecursionAndBackTracking.l3;

import java.util.ArrayList;
import java.util.List;

public class implementBinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);
        System.out.println(binarySearch(list, 0, list.size()-1, 2));
    }

    public static boolean binarySearch(List<Integer> list, int start, int end, int target) {
        int mid = start + ((end - start)/2);
        int element = list.get(mid);
        if (start >= end) {return false;}
        if (element == target) {
            return true;
        }
        else if (element < target) {
            return binarySearch(list, mid + 1, end, target);
        }
        else {
           return binarySearch(list, start, mid -1, target);
        }
    }

}
