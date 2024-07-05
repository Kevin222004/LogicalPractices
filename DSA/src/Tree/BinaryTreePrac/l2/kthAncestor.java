// the solutin have a small issue
//try it with the arraylist mehtod
package Tree.BinaryTreePrac.l2;

public class kthAncestor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        // the cod ehave issues .
        BinaryTree bt = new BinaryTree(arr);
        bt.populate();
        System.out.println(bt.getKthAncestore());
    }


}
