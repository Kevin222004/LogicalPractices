package Tree.BinarySearchTreePrac.l1;

public class Searching {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.takeInput(new int[]{500, 150, 250, 600, 650, 170, 90, 220, 501, 1000, 111, 999});
        System.out.println(bst.search(90));
    }


}
