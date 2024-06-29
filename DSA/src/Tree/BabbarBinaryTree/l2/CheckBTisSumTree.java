/*


 */
package Tree.BabbarBinaryTree.l2;

public class CheckBTisSumTree {
    public static void main(String[] args) {
        int[] tree = {26, 10, 4, -1, -1, 6, -1, -1, 3, -1, 3, -1, 3};
        BinaryTree bt = new BinaryTree(tree);
        bt.populate();
        bt.display();
        bt.SumTree();
    }
}
