package Greedy;

import java.util.PriorityQueue;

public class MinRopeJoinCost {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {4, 3, 2, 6};
        for (int i : arr) {
            pq.add(i);
        }

        int sum = 0;
        while (pq.size() >= 2) {
            int a = pq.poll();
            int b = pq.poll();
            sum += a + b;
            pq.add(a + b);

        }

        System.out.println(sum);
    }
}
