package Tree.Babbar.l1;

import java.util.Scanner;

public class PreOrderTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.populate(new Scanner(System.in));
        bt.PreOrderTraversal();
    }
}
