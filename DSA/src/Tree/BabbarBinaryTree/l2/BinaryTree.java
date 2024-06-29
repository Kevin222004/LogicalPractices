/*

Binary Tree Implementation as a input of array where -1 is null and tree
data in array is in pre-order form

*/

package Tree.BabbarBinaryTree.l2;

public class BinaryTree {

    private Node root;

    int[] arr;

    public BinaryTree(int[] arr) {
        this.arr = arr;
    }

    int index = 0;

    public Node populate() {
        int rootValue = arr[index];
        index++;
        root = new Node(rootValue);
        populate(root);
        return root;
    }

    private boolean checkNode() {
        if (index >= arr.length) {
            return false;
        }
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

    private int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int maxHeight = Math.max(heightOfTree(root.right), heightOfTree(root.left)) + 1;
        return maxHeight;
    }


    //------------------------Check If a Binarytree is Balanced or not---------------------------//

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node root) {
//        base case
        if (root == null) {
            return true;
        }

        // 1st case
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int diff = Math.abs(leftHeight - rightHeight);
        boolean ans1 = (diff<=1);

        // recursion
        boolean leftAns = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);

        if (leftAns && rightAns && ans1) {
            return true;
        }
        return false;
    }

    //---------------------------------------------------------------------------//

    public void SumTree() {
        int sumtree = SumTree(root);

        System.out.println(sumtree);
    }

    private int SumTree(Node root) {
        if (root == null) {
            return 0;
        }
        root.value = SumTree(root.left) + root.value + SumTree(root.right);
        return root.value;
    }

    ////////////////////////////////////////////////////////////////////////////////////

    public boolean getKthAncestore() {
        return kthAncestor(root, 1, 4);
    }

    // assume p is a node carrying data 120
    private boolean kthAncestor(Node root, int k, int p) {
        // base case
        if (root == null) {
            return false;
        }

        if (root.value == p) {
            return true;
        }

        boolean left = kthAncestor(root.left, k, p);
        boolean right = kthAncestor(root.right, k, p);

        if ((left || right )&& k > 0) {
            k--;
         }
        if (k == 0) {
            System.out.println(root.value);
            k = -1;
        }

        return left || right;
    }

}
