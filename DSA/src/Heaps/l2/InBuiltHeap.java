/*

 priority queue is by default min heap

 PriorityQueue<Integer> heap = new PriorityQueue<>(); // min heap

 PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder()); // max heap

*/


package Heaps.l2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class InBuiltHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        heap.add(12);heap.add(15);heap.add(13);heap.add(11);heap.add(14);
        System.out.println(heap);
        System.out.println(heap.peek());
        System.out.println(heap);
        System.out.println(heap.poll());
        System.out.println(heap);
    }
}
