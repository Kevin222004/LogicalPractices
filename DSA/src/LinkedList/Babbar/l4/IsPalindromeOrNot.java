package LinkedList.Babbar.l4;

public class IsPalindromeOrNot {
    public static void main(String[] args) {
        Node n1 = new Node(1, new Node(2, new Node(3, new Node( 3,new Node(2, new Node(1))))));
        System.out.println(isPalidrome(n1));
    }

    static boolean isPalidrome(Node head) {
        if (head == null) {
            return false;
        } if (head.next == null) {
            return true;
        }

        Node slow = head, fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        // reverse the linkedlist from mid+1
        Node reversekahead = reverse(slow.next);
        slow.next = reversekahead;

        // start comparison
        Node temp1 = head;
        Node temp2 = reversekahead;
        while (temp2 != null) {
            if(temp1.data != temp2.data) {
                return false;
            }
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return true;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
