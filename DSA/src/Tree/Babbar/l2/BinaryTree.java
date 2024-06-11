/*

Binary Tree Implementation as a input of array where -1 is null and tree
data in array is in pre-order form

*/

package Tree.Babbar.l2;

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


        private void InOrderTraversal(Node root) {
        if (root ==null) {
            return;
        }

        InOrderTraversal(root.left);
        System.out.println(root.value);
        InOrderTraversal(root.right);
    }

    public void InOrderTraversal() {
        InOrderTraversal(root);
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////

    //---------------------------Pre-Order----------------//
    private void PreOrderTraversal(Node root) {
        if (root ==null) {
            return;
        }

        System.out.println(root.value);
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);


    }

    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }

    ///////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////
    //----------------------Post-order-------------------------//
    private void postOrderTraversal(Node root) {
        if (root ==null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.value);

    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }
}