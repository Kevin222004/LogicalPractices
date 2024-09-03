package DSA.src.Queues.prac.l2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(3);queue.add(6);queue.add(9);queue.add(12);queue.add(15);queue.add(5);
        int k = 4;
        System.out.println(queue);
        reverseKElement(queue, k);
        System.out.println(queue);
    }

    public static void reverseKElement(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.add(q.poll());
        }

    while (!stack.isEmpty()) {
        q.add(stack.pop());
    }

    for (int i = 0; i < q.size() - k ; i++  ) {
        int data = q.poll();
        q.add(data);
    }

    }
}
