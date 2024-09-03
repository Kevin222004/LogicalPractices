/*

remove dubplicate
input // 1 2 2 3 4 4
output // 1 2 3 4

*/

package LinkedList.Prac.l4;

public class RemoveDuplicateFromASortedList {
    public static void main(String[] args) {
        Node n1 = new Node(1, new Node(2, new Node(2, new Node(3, new Node(4, new Node(4))))));
        removeDuplicate(n1).print(removeDuplicate(n1));
    }

    static Node removeDuplicate(Node n1) {
        if (n1.next == null) {
            return n1;
        }
        if (n1 == null) {
            return null;
        }

        Node current = n1;
        Node tempNode = current;
        Node next = n1.next;
        while (next != null) {
            if (current.data != next.data) {
                current = next;
                next = next.next;
            } else {
                Node temp = next.next;
                while (temp != null && next.data == temp.data) {
                    temp = temp.next;
                }
                next = temp;
                current.next = temp;
            }
        }

        return tempNode;
    }
}
