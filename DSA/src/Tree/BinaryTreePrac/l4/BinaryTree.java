package Tree.BinaryTreePrac.l4;

public class BinaryTree {

    private Node root;

    int[] arr;

    public BinaryTree(int[] arr) {
        this.arr = arr;
    }

    int index = 0;

    public void populate() {
        int rootValue = arr[index];
        index++;
        root = new Node(rootValue);
        populate(root);
    }

    private boolean checkNode() {
        if (arr[index] != -1) {
            return true;
        }
        else {
            return false;
        }
    }

    private void populate(Node node) {
        boolean left = checkNode();
        if (left) {
            int value = arr[index];
            node.left = new Node(value);
            index++;
            populate(node.left);
        }
        else {
            index++;
        }
        boolean right = checkNode();
        if (right) {
            int value = arr[index];
            node.right = new Node(value);
            index++;
            populate(node.right);
        }
        else {
            index++;
        }
    }

    public void display() {
        display(this.root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent);
        display(node.right, indent);
    }


    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}