package Tree.Implementation.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTreeImplementation bst = new BinarySearchTreeImplementation();
//        bst.takeInput();
        BinarySearchTreeInputFromArray bst = new BinarySearchTreeInputFromArray();
        int[] arr = {500, 150, 250, 600, 170, 90, 220, 501, 1000, 111, 999};
        bst.takeInput(arr);
        bst.display();
    }
}
