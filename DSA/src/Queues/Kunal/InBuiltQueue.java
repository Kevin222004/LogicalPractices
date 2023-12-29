// InBuilt Queue

package Queues.Kunal;

import java.util.*;

public class InBuiltQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue =new LinkedList<>();
//        queue.add(4);
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
//
//        System.out.println(queue.remove());
//        System.out.println(queue);

        // Doubly ended queue -->  deque

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);deque.add(4);deque.add(3);deque.add(2);
        System.out.println(deque);
    }
}
