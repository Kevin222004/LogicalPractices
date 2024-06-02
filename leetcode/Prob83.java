/*

Problem 83. Remove Duplicates from Sorted List


*/
package leetcode;

public class Prob83 {
}

class Solution83 {
    public ListNode deleteDuplicates(ListNode n1) {
        if (n1 == null) {
            return null;
        }

        if (n1.next == null) {
            return n1;
        }

        ListNode current = n1;
        ListNode tempNode = current;
        ListNode next = n1.next;
        while (next != null) {
            if (current.val != next.val) {
                current = next;
                next = next.next;
            } else {
                ListNode temp = next.next;
                while (temp != null && next.val == temp.val) {
                    temp = temp.next;
                }
                next = temp;
                current.next = temp;
            }
        }

        return tempNode;
    }

    class ListNode {
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
    }

}

