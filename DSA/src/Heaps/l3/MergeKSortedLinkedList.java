/*

[[1,4,5],[1,3,4],[2,6]]

 */
package Heaps.l3;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};
        ListNode ans = mergeKLists(lists);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        if (lists.length == 0) {
            return null;
        }

        // first element of ll should be inserted in queue
        for (int i = 0; i  < lists.length; i++){
            if (lists[i] != null) {
                queue.add(lists[i]);
            }
        }

        // get minimum element store it and pop it and update the heap with new element in same ll
        ListNode head = null;
        ListNode tail = null;
        while (!queue.isEmpty()) {
            ListNode temp = queue.peek();
            queue.poll();

            // temp may or may not be the first element of answer linked list
            if (head == null) {
                // temp -> first elemnt of ll
                head = temp;
                tail = temp;
                if (temp.next !=null) {
                    queue.add(temp.next);
                }
            } else {
                tail.next = temp;
                tail = temp;
                if (temp.next !=null) {
                    queue.add(temp.next);
                }
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}