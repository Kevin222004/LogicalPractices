package LinkedList.Kunal;

public class  SinglyLinkedListImplementation {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);

        System.out.println(ll.deleteAtIndex(2));
        ll.printLinkedList();
    }
}

/*--------------------------------------Singly LinkedList----------------------------*/
class SinglyLinkedList {

    private Node Head;

    private Node Tail;

    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    /*-------------------------------------------- insertion------------------------------ */
    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.nextNode = Head;
        Head = node;

        if (Tail == null) {
            Tail = node;
        }

        size++;
    }

    public void insertAtLast(int value) {

        Node node = new Node(value);

        if (Tail == null) {
            insertAtFirst(value);
        } else {
            Tail.nextNode = node;
            Tail = node;
        }

        size++;
    }

    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertAtFirst(value);
        } else if (index == size) {
            insertAtLast(value);
        } else {
            Node temp = Head;
            for (int i = 1; i < index; i++) {
                temp = temp.nextNode;
            }
            Node node = new Node(value);
            node.nextNode = temp.nextNode;
            /* we can use our constructor also by removing above line we can write Node node = new Node(value, temp.nextNode) */
            temp.nextNode = node;
            size++;
        }
    }

    /*---------------------------insertion Finished-------------------------------*/

    /*---------------------------------Deletion-----------------------------------*/

    public int deleteAtFirst() {
        int val = Head.value;
        Head = Head.nextNode;
        if (Head == null) {
            Tail = null;
        }
        size--;
        return val;
    }

    public int deleteAtLast() {

        if (size <= 1) {
            return deleteAtFirst();
        }

        Node tempNode = Head;
        for (int i = 1; i < size-2; i++) {
            tempNode = tempNode.nextNode;
        }

        int value = Tail.value;
        Tail = tempNode;
        Tail.nextNode = null;
        size--;
        return value;
    }

    public int deleteAtIndex(int index) {
        int val;
        if (index == 0) {
            return deleteAtFirst();
        } else if (index == size) {
            return deleteAtLast();
        } else {
            Node tempNode = Head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.nextNode;
            }
            val = tempNode.nextNode.value;
            tempNode.nextNode = tempNode.nextNode.nextNode;
            size--;
        }
        return val;
    }

    /*---------------------------Deletion Complete------------------------------*/

    /*--------------------------Printing----------------------------------------- */
    public void printLinkedList() {
        Node tempNode = Head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " --> ");
            tempNode = tempNode.nextNode;
        }
        System.out.println();
    }

    /*----------------------------printing finshed--------------------------------*/

    /*-------------------------Node--------------------------------------------*/
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
    /*---------------------------------------Node Finish-----------------------------*/
}

/*--------------------------------------Singly LinkedList Finsihed ----------------------------*/