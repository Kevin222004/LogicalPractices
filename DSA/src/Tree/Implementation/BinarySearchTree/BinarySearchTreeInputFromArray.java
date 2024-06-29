package Tree.Implementation.BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTreeInputFromArray {

    private Node root;

    public BinarySearchTreeInputFromArray() {
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

    public void takeInput(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            root = insertIntoBst(root, arr[i]);
            i++;
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
        }
        else {
            node.right = insertIntoBst(node.right, data);
        }

        return node;
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}