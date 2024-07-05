package LinkedList.Prac.l3;

public class ReverseInKGroups {
    public static void main(String[] args) {
        Node head;
        Node n1 = new Node(1, (new Node(2, new Node(3, new Node(4, new Node(5, new Node(6)))))));
        head = n1;
        print(reverseKgroup(head, 3));
    }

    static Node reverseKgroup(Node head, int k){
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }
        int length = getlength(head);
        if (k > length) {
            System.out.println("Enter valid value of k");
            return head;
        }

        Node prev = null;
        Node current = head;
        Node forward = current.next;

        int count = 0;

        while (count < k) {
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
            count++;
        }

        if (forward != null) {
            head.next = reverseKgroup(forward, k);
        }

        return prev;

    }

    static int getlength(Node head) {
        int len = 0;
        Node temp  =  head;
        while (temp != null) {
            len = len+1;
            temp = temp.next;
        }
        return len;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
    }
}