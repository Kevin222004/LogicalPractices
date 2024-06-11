package Tree.KunalsTree.binaryTreeImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImplementationBinaryTree tree = new ImplementationBinaryTree();

        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();
    }
}
