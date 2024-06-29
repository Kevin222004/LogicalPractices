/*

first approach:- brute force 2 loops

2 two pointer apporach



*/

package Searching.BinarySearch.Assignment;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.*;

public class kdiffpair {
    public static void main(String[] args) {
//        https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

    }
}



class Solutionnnn {
    public int findPairs(int[] arr, int k) {
        Arrays.sort(arr);
        HashSet<String> pairs = new HashSet<>();
        int i = 0;
        int j  = i + 1;
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                pairs.add(arr[i] + "," +arr[j]);
                        i++; j++;
            }
            else if (diff > k) {
                i++;
            }
            else {
                j++;
            }
            if (i == j) {
                j++;
            }
        }
        return pairs.size();
    }
}


// binary Search
class Solutionnnnnnnnnnnnnn {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<String> pairs = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (binarySearch(nums, i+1, nums[i]+k) != -1) {
               pairs.add(nums[i]+ "" + nums[i] + k);
            }
        }
      return pairs.size();
    }

    int binarySearch(int[] arr, int start, int target) {
        int s = start; int e = arr.length;
        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] == target) {
                return m;
            }
            else if (target > arr[m]) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
        return -1;
    }
}