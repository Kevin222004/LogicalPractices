package LinkedList.Impl;

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtFirst(3);
        dll.insertAtFirst(2);
        dll.insertAtFirst(1);
        dll.insertAtLast(4);
        dll.insertAtIndex(0, 3);
        dll.printDoublyLinkedList();
    }
}

class DoublyLinkedList {

    private Node Head;

    private Node Tail;

    int size = 0;

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        if (Head == null) {
            Head = Tail = node;
            size++;
            return;
        }
        node.nextNode = Head;
        Head.previousNode = node;
        Head = node;
        size++;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);
        if (size == 0) {
            insertAtFirst(value);
        } else {
            Tail.nextNode = node;
            node.previousNode = Tail;
            Tail = node;
            size++;
        }
    }

    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        if (index == size) {
            insertAtLast(value);
            return;
        }
        Node temp = Head;
        for (int i = 1; i < index; i++) {
            temp = temp.nextNode;
        }
        Node node = new Node(value);
        node.nextNode = temp.nextNode;
        temp.nextNode = node;
        node.previousNode = temp;
        if (node.nextNode != null) {
            node.nextNode.previousNode = node;
        }
        size++;
    }

    void printDoublyLinkedList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    private static class Node {
        int value;
        Node nextNode;
        Node previousNode;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node nextNode) {
            this.value = val;
            this.nextNode = nextNode;
        }

        public Node(int val, Node nextNode, Node previousNode) {
            this.value = val;
            this.nextNode = nextNode;
            this.previousNode = previousNode;
        }
    }
}