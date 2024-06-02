package linkedlist;

public class Singlylinkedlist {
    public static void main(String[] args) {
        SinglylinkedlistImpl ll = new SinglylinkedlistImpl();
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.insertAtFirst(5);
        ll.deleteAtFirst();
        ll.insertAtLast(5);
        ll.deleteAtLast();
        ll.insertAtIndex(3, 5);
        ll.print();
    }
}

class SinglylinkedlistImpl {

    Node Head;

    Node Tail;

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = Head;
        Head = node;

        if (Tail == null) {
            Tail = node;
        }
    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
        if (Tail == null) {
            insertAtFirst(val);
            return;
        }
        Tail.next = node;
        Tail = node;
    }

    public void deleteAtFirst() {
        if (Head == null) {
            System.out.println("Head is null0");
            return;
        }
        Head = Head.next;
    }

    public void deleteAtLast() {
        if (Tail == null) {
            System.out.println("Already null");
        }

        Node temp = Head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        Tail = temp;
        Tail.next = null;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    public void insertAtIndex(int index, int val) {
        if (Tail == null) {
            insertAtFirst(val);
            return;
        }
        Node temp = Head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        Node node  = new Node(val, temp.next);
        temp.next = node;

    }

    public void deleteAtindex() {}

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
