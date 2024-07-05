/*

variation
    1. loop is present or not
    2. starting point of loop
    3. remove loop

 */

package LinkedList.Prac.l3;

public class DetectAndDeleteGroup {
    public static void main(String[] args) {
        NodeDC n1 = new NodeDC(1);
        NodeDC n2 = new NodeDC(2);
        NodeDC n3 = new NodeDC(3);
        NodeDC n4 = new NodeDC(4);
        NodeDC n5 = new NodeDC(5);
        NodeDC n6 = new NodeDC(6);
        NodeDC n7 = new NodeDC(7);
        NodeDC n8 = new NodeDC(8);
        NodeDC n9 = new NodeDC(9);
        NodeDC Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n5;

        removeOfLoop(n1);
        n1.print(n1);


    }

    static boolean CheckForLoop(NodeDC head) {
        if (head == null) {
            return false;
        }

        NodeDC slow = head;
        NodeDC fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast) {
                return true;
            }
        }


        return false;
    }

    static NodeDC startingPointOfLoop(NodeDC head) {
        if (head == null) {
            return null;
        }

        NodeDC slow = head;
        NodeDC fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }


    static void removeOfLoop(NodeDC head) {
        if (head == null) {
            return;
        }

        NodeDC slow = head;
        NodeDC fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast) {
                slow = head;
                NodeDC prev = fast;
                while (slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                prev.next = null;
                return;
            }
        }
        return;
    }
}

class NodeDC {
    int data;

    NodeDC next;

    public NodeDC(int data) {
        this.data = data;
    }

    public NodeDC(int data, NodeDC next) {
        this.data = data;
        this.next = next;
    }

    public static void print(NodeDC head) {
        NodeDC temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
