/*

LevelOrderTraversal

*/
package Tree.BinaryTreePrac.l1;

import java.util.Scanner;

public class LevelOrderTraversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();

        bt.populate(sc);
        bt.LevelOrderTraversal();
        System.out.println("-------------------------");
        bt.LevelOrderTraversalPrint();
    }

/*  --> Checkout code in BinaryTree class

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


*/

}
