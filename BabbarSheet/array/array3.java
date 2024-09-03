/*

https://practice.geeksforgeeks.org/problems/kth-smallest-element/0

 */

package BabbarSheet.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class array3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20, 15};
        System.out.println(kthSmallest(arr, 4));
    }


    // solve using sort which is prohibited in question
    // public static int kthSmallest(int[] arr, int k) {
    //     Arrays.sort(arr);
    //     return arr[k-1];
    // }


    public static int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            int min = minHeap.peek();
            if (arr[i] < min) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.poll();
    }
}
