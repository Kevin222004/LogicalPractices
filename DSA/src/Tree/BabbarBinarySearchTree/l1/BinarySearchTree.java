package Tree.BabbarBinarySearchTree.l1;

import java.util.Scanner;

public class BinarySearchTree {

    private static Node root;

    public BinarySearchTree() {
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

    //------------------------Bst searching----------------------------------------//

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.value == data) {
            return true;
        }
        if (root.value > data) {
            return search(root.left, data);
        }
        else {
            return search(root.right, data);
        }
    }

    //------------------------------------------------------------------------------//

    //-----------------------------------min max-------------------------------------//

    public int[] MinAndMax() {
        int min = minval(root);
        int max = maxval(root);
        return new int[]{max, min};
    }

    private int minval(Node root) {
        int min = Integer.MAX_VALUE;
        while (root != null) {
            min = root.value;
            root = root.left;
        }
        return min;
    }

    private int maxval(Node root) {
        int max = Integer.MIN_VALUE;
        while (root != null) {
            max = root.value;
            root = root.right;
        }
        return max;
    }

}