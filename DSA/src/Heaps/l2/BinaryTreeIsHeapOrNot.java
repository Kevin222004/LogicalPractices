package Heaps.l2;


public class BinaryTreeIsHeapOrNot {
    public static void main(String[] args) {
    }

    static Pair<Boolean, Integer> solve(Node root) {
        // base case
        if (root == null) {
            Pair<Boolean, Integer> p = new Pair<>(true, Integer.MIN_VALUE);
            return p;
        }
        if (root.left == null && root.right == null) {
            // leaf Node
            Pair<Boolean, Integer> pair = new Pair<>(true, root.data);
            return pair;
        }

        Pair<Boolean, Integer> leftAns = solve(root.left);
        Pair<Boolean, Integer> rightAns = solve(root.right);
        if (leftAns.getFirst()
                && rightAns.getFirst()
                && root.data > leftAns.getSecond()
                && root.data > rightAns.getSecond()) {
            return new Pair<>(true, root.data);
        } else {
            return new Pair<>(false, root.data);
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

}

class Pair<F, S> {

    private final F first; //first member of pair
    private final S second; //second member of pair

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + this.first + ", " + this.second + ")";
    }
}