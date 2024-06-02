package leetcode;

public class Prob82 {
    public static void main(String[] args) {
        Solution82.ListNode l1 = new Solution82.ListNode(1, new Solution82.ListNode(2, new Solution82.ListNode(3, new Solution82.ListNode(3, new Solution82.ListNode(4, new Solution82.ListNode(4, new Solution82.ListNode(5)))))));
        l1.print(l1);
        Solution82 sol = new Solution82();
        Solution82.ListNode ans = Solution82.deleteDuplicates(l1);
        ans.print(ans);
    }
}

class Solution82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0, head); // Create a dummy node for easier manipulation
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Find the end of the consecutive duplicates
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            // If the current node is a duplicate (i.e., the previous node is pointing to the same value), skip it
            if (prev.next == curr) {
                prev = prev.next;
            } else { // Otherwise, link the previous node to the current node
                prev.next = curr.next;
            }

            curr = curr.next; // Move to the next node
        }
        return dummy.next; // Return the head of the list
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void print(ListNode l1) {
            ListNode l = l1;
            while (l != null) {
                System.out.print(l.val + " ");
                l = l.next;
            }
            System.out.println();
        }
    }
}