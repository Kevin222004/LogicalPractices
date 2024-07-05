package Tree.BinarySearchTreePrac.l1;

import java.util.Arrays;

public class MinimumAndmaximum {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.takeInput(new int[]{500, 150, 250, 600, 1, 170, 90, 220, 501, 1000, 111, 999});
        System.out.println(Arrays.toString(bst.MinAndMax()));
    }
}
