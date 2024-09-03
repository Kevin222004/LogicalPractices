package Heaps.l4;

import java.util.PriorityQueue;

public class RemoveStoneToMinimizeTheTotal {
    public static void main(String[] args) {

    }

    class SolutionRemoveStoneToMinimizeTheTotal {
        public int minStoneSum(int[] piles, int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
            for (int i = 0; i < piles.length; i++) {
                maxHeap.add(piles[i]);
            }

            while (k != 0) {
                int maxElement = maxHeap.poll();
                maxHeap.poll();
                maxElement = maxElement - ((int) Math.floor(maxElement / 2));
                maxHeap.add(maxElement);
            }

            int sum = 0;
            while (!maxHeap.isEmpty()) {
                int temp = maxHeap.peek();
                maxHeap.poll();
                sum += temp;
            }
            return sum;
        }
    }
}
