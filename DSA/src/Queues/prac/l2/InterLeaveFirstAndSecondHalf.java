package DSA.src.Queues.prac.l2;

import java.util.ArrayDeque;
import java.util.Queue;

public class InterLeaveFirstAndSecondHalf {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);queue.add(20);queue.add(30);queue.add(40);queue.add(50);queue.add(60);
        System.out.println(queue);
        interleave(queue);
        System.out.println(queue);
    }

    public static void interleave(Queue<Integer> queue) {
        Queue<Integer> q = new ArrayDeque<>();
        int s = queue.size()/2;
        for (int i = 0; i < s; i++) {
            q.add(queue.poll());
        }

        while (!q.isEmpty()) {
            int data = queue.poll();
            queue.add(q.poll());
            queue.add(data);
        }
    }
}
