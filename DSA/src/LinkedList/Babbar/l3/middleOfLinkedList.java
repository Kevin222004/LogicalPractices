package LinkedList.Babbar.l3;

public class middleOfLinkedList {
    public static void main(String[] args) {
        node head;
        node n1 = new node(1, (new node(2, new node(3, new node(4, new node(5, new node(6)))))));
        head = n1;
        print(head);
        System.out.println(findMiddleNode(head).data);
    }

    static node findMiddleNode(node head) {
        if (head.next == null) {
            return head;
        }
        if (head == null) {
            return null;
        }
        node slow = head;
        node fast = head;

        while (slow != null && fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                // once fast will move ahead and then slow
                slow = slow.next;
            }
        }

        return slow;
    }

    static void print(node head) {
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class node {
        int data;
        node next;

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }
        public node(int data) {
            this.data = data;
        }
    }
}


