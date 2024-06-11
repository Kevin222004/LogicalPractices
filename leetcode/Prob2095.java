package leetcode;

public class Prob2095 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        Solution2095 solution2095 = new Solution2095();
        solution2095.print(l1);
        solution2095.print(solution2095.deleteMiddle(l1));
    }
}


class Solution2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode r = head;
        ListNode slow = r;
        ListNode fast = r;
        ListNode prev = null;
        while (slow != null && fast!=null) {
            fast = fast.next;
            if (fast != null) {
                prev = slow;
                fast = fast.next;
                slow = slow.next;
            }
        }

        ListNode mid = slow;
        if (mid != null){
            mid = mid.next;
            prev.next = mid;}
        return r;
    }

    void print(ListNode h) {
        ListNode t = h;
        while (t!=null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.println();
    }
}