package Tree.Impl;

import java.util.Scanner;

public class BinaryTreeImpl {

    private Node rootNode;

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void Implementation(Scanner scanner) {
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        rootNode = new Node(val);
        Implementation(scanner, rootNode);
    }

    private void Implementation(Scanner scanner, Node root) {
        System.out.println("Do you want to enter the left node " + root.val);
        boolean ansForLeft = scanner.nextBoolean();
        if (ansForLeft) {
            System.out.println("Enter the value of left node " + root.val);
            int val = scanner.nextInt();
            root.left = new Node(val);
            Implementation(scanner, root.left);
        }
        System.out.println("Do you want to enter the right node " + root.val);
        boolean ansForRight = scanner.nextBoolean();
        if (ansForRight) {
            System.out.println("Enter the value of left node " + root.val);
            int val = scanner.nextInt();
            root.right = new Node(val);
            Implementation(scanner, root.right);
        }
    }


    public void display() {
        display(this.rootNode, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

}
