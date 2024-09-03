package LinkedList.Prac.l1;

public class ReverseALinkedList {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtFirst(5);
        ll.insertAtFirst(4);
        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);
        ll.printLinkedList();

        Node prev = null;
        Node curr = ll.Head;
        Node head = ll.reverseLoop(ll.Head);
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.nextNode;
        }

    }

    static class SinglyLinkedList {

        private Node Head;

        private Node Tail;

        private int size;

        public SinglyLinkedList() {
            this.size = 0;
        }

        //--------------------------------------Reverse-------------------------------------//\
        public Node reverse(Node prev, Node curr) {
            if (curr == null) {
                return prev;
            }

            // 1 case
            Node next = curr.nextNode;
            curr.nextNode = prev;
            return reverse(curr, next);
        }

        public Node reverseLoop(Node head) {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.nextNode;
                curr.nextNode = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        /////////////////////////////////////////////////////////////////////////

        public void insertAtFirst(int value) {
            Node node = new Node(value);
            node.nextNode = Head;
            Head = node;

            if (Tail == null) {
                Tail = node;
            }

            size++;
        }

        public void printLinkedList() {
            Node tempNode = Head;
            while (tempNode != null) {
                System.out.print(tempNode.value + " --> ");
                tempNode = tempNode.nextNode;
            }
            System.out.println();
        }
    }

    private static class Node {
        private final int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.nextNode = node;
        }
    }
}
