package Heaps.l2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_smallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] arr = {10, 5, 20, 4, 15};
        int k = 2;
        // create max heap of k element of array
        for (int i = 0; i < k; i++) {
            heap.add(arr[i]);
        }

        // for remaining element, push only if they are less then top
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < heap.peek()) {
                heap.poll();
                heap.add(arr[i]);
            }
        }

        System.out.println(heap.peek());
    }

}
