package Tree.BinaryTreePrac.l1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
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

    // insert Element
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node");
        int rootValue = scanner.nextInt();
        root = new Node(rootValue);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("DO you want to enter the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("DO you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
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

    ///////////////////////////////////////////////////////////////////////////////////

    //--------------------------Level Order Traversal-------------------------------//

    public void LevelOrderTraversal() {
        Node tempRoot = this.root;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(tempRoot);
        while (!queue.isEmpty()) {

            Node currNodeInQueue = queue.remove();

            if (currNodeInQueue.left != null) {
                queue.add(currNodeInQueue.left);
            }

            if (currNodeInQueue.right != null) {
                queue.add(currNodeInQueue.right);
            }

            System.out.println(currNodeInQueue.value + " ");

        }
    }


    public void LevelOrderTraversalPrint() {
        Node tempRoot = this.root;
        Queue queue = new ArrayDeque<>();
        queue.add(tempRoot);
        queue.add("null");
        while (!queue.isEmpty()) {
            if (queue.peek().equals("null")) {
                queue.remove();
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add("null");
                }
            } else {
                Node currNodeInQueue = (Node) queue.remove();

                if (currNodeInQueue.left != null) {
                    queue.add(currNodeInQueue.left);
                }

                if (currNodeInQueue.right != null) {
                    queue.add(currNodeInQueue.right);
                }

                System.out.print(currNodeInQueue.value + " ");
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////

    //--------------------------In Order Traversal-------------------------------//
    private void InOrderTraversal(Node root) {
        if (root == null) {
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
        if (root == null) {
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
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.value);

    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }
    /////////////////////////////////////////////////////////////////////////

    //------------------------------HEIGHT OF Tree-----------------------------//

    public int heightOfTree() {
        return heightOfTree(root);
    }

    private int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int maxHeight = Math.max(heightOfTree(root.right), heightOfTree(root.left)) + 1;
        return maxHeight;
    }

    //////////////////////////////////////////////////////////////////////

    //----------------Diameter of tree----------------------------//

    private int diamter(Node root) {
        if (root == null) {
            return 0;
        }

        int opt1 = (diamter(root.left));
        int opt2 = diamter(root.right);
        int opt3 = (heightOfTree(root.left) + 1 + heightOfTree(root.right)) - 1; // +1 is of root and in ans we have to count edge thats why -1

        return Math.max(opt2, Math.max(opt1, opt3));
    }

    public int diameter() {
        return diamter(root);
    }

}
