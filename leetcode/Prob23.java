package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob23 {
    public static void main(String[] args) {

//[[1,4,5],[1,3,4],[2,6]]
//        ListNode23 head1 = new ListNode23(1);
//        head1.next = new ListNode23(4);
//        head1.next.next = new ListNode23(5);
//        ListNode23 head2 = new ListNode23(1);
//        head2.next = new ListNode23(3);
//        head2.next.next = new ListNode23(4);
//        ListNode23 head3 = new ListNode23(2);
//        head3.next = new ListNode23(6);
        ListNode23[] lists = {null, null, null};
        Solution23 sol = new Solution23();
        ListNode23 node = sol.mergeKLists(lists);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class ListNode23 {
    int val;
    ListNode23 next;

    ListNode23() {
    }

    ListNode23(int val) {
        this.val = val;
    }

    ListNode23(int val, ListNode23 next) {
        this.val = val;
        this.next = next;
    }
}


class Solution23 {
    public ListNode23 mergeKLists(ListNode23[] lists) {
        int index = 1;
        List<ListNode23> ans1 = new ArrayList<>();
        ListNode23 temp1 = lists[0];
        while (temp1 != null) {
            ans1.add(temp1);
            temp1 = temp1.next;
        }
        List<ListNode23> ans = sorting(lists, index, ans1);
        if (ans.isEmpty()) {
            return null;
        }
        ListNode23 Head = ans.get(0);
        ListNode23 current = Head;
        for (int i = 1; i < ans.size(); i++) {
            current.next = ans.get(i);
            current = current.next;
        }
        current.next = null; // Ensure the last node points to null
        return Head;
    }

    List<ListNode23> sorting(ListNode23[] lists, int index, List<ListNode23> ans) {
        if (index < lists.length) {
            ListNode23 head1 = lists[index];
            int j = 0;
            List<ListNode23> newAns = new ArrayList<>();

            while (head1 != null || j < ans.size()) {

                // possiblity-1
                while (head1 != null && (j) < ans.size()) {

                    ListNode23 jNode = ans.get(j);

                    if (head1.val <= jNode.val) {
                        newAns.add(head1);
                        head1 = head1.next;
                    } else {
                        newAns.add(jNode);
                        j++;
                    }

                }

                // possiblity-2
                while (head1 != null && j >= ans.size()) {
                    newAns.add(head1);
                    head1 = head1.next;
                }

                // possiblity-3
                while (head1 == null && j < ans.size()) {
                    newAns.add(ans.get(j));
                    j++;
                }


            }
            return sorting(lists, index + 1, newAns);
        }
        return ans;
    }


}