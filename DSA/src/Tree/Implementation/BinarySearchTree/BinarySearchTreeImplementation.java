package Tree.Implementation.BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTreeImplementation {

    private Node root;

    public BinarySearchTreeImplementation() {
    }

    public int getHeight(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Nodes: ");
    }

    private void display(Node root, String details) {
        if (root == null) {
            return;
        }
        System.out.println(details + root.getValue());
        display(root.left, "Left child of " + root.getValue() + " : ");
        display(root.right, "right child of " + root.getValue() + " : ");
    }

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            root = insertIntoBst(root, data);
            data = sc.nextInt();
        }
    }

    public Node insertIntoBst(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            if (root == null) {
                root = node;
            }
            return node;
        }

        if (node.value > data) {
            node.left = insertIntoBst(node.left, data);
        } else {
            node.right = insertIntoBst(node.right, data);
        }

        return node; // Return the current node with updated children
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}