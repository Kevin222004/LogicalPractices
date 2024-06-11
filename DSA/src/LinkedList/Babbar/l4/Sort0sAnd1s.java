//package LinkedList.Babbar.l4;
//
//public class Sort0sAnd1s {
//    public static void main(String[] args) {
//        Node n1 = new Node(1, new Node(1, new Node(2, new Node( 2,new Node(0, new Node(0))))));
//        Node.print(sort(n1));
//    }
//
//    static Node sort(Node head) {
//        Node dumm1 = new Node(-1);Node dumm0 = new Node(-1);Node dumm2 = new Node(-1);
//        Node dumm1Tail = dumm1;Node dumm0Tail = dumm0;Node dumm2Tail = dumm2;
//        Node curr = head;
//        while (curr != null) {
//            if (curr.data == 0) {
//                Node temp = curr;
//                curr = curr.next;
//                temp.next = null;
//
//                dumm0Tail.next = temp;
//                dumm0Tail = temp;
//            }
//            else if (curr.data == 1) {
//                Node temp = curr;
//                curr = curr.next;
//                temp.next = null;
//
//                dumm1Tail.next = temp;
//                dumm1Tail = temp;
//            }
//            else if (curr.data == 2) {
//                Node temp = curr;
//                curr = curr.next;
//                temp.next = null;
//
//                dumm2Tail.next = temp;
//                dumm2Tail = temp;
//            }
//        }
//
//        // join them
//
//        // remove dummy nodes
//
//        // return head of the modififed linkedlist
//
//
//
//        return ;
//    }
//}
