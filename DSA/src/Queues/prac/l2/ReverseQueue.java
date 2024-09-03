package DSA.src.Queues.prac.l2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);queue.add(2);queue.add(3);queue.add(4);queue.add(5);
        System.out.println(queue);
        reverseQueue(queue);
        System.out.println(queue);
        reverseUsingRec(queue);
        System.out.println(queue);
    }

    // 1st approach stack Time complexity = O(n) and Space complexity = O(n)
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
       while (!queue.isEmpty()) {
            stack.add(queue.poll());
        }

        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // recursion T.C = O(n) S.C = O(1)
    public static void reverseUsingRec(Queue<Integer> q) {
        if (q.isEmpty()){
            return;
        }
        int data = q.poll();
        reverseQueue(q);
        q.add(data);
    }
}
