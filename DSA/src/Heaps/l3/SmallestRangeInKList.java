// leetcode 632
package Heaps.l3;

import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeInKList {
    public static void main(String[] args) {

    }

    public static int[] smallestRange(List<List<Integer>> nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        PriorityQueue<Node> heap = new PriorityQueue<>(Node::compareTo);

        for (int i = 0; i < nums.size(); i++) {
            int element = nums.get(i).get(0);
            maxi = Math.max(maxi, element);
            mini = Math.min(mini, element);
            heap.add(new Node(element, i, 0));
        }

        int ansStart = mini;
        int ansEnd = maxi;

        while (!heap.isEmpty()) {
            Node top = heap.peek();
            int topEle = top.data;
            int topRow = top.row;
            int topCol = top.col;
            heap.poll();

            // mini updated
            mini = topEle;
            // check for ans
            if (maxi - mini < ansEnd - ansStart) {
                ansStart = mini;
                ansEnd = maxi;
            }

            // check for new element in same list
            if (topCol + 1 < nums.get(topRow).size()) {
                maxi = Math.max(maxi, nums.get(topRow).get(topCol + 1));
                Node nodenew = new Node(nums.get(topRow).get(topCol + 1), topRow, topCol + 1);
                heap.add(nodenew);
            } else {
                // their is no elemnt in same list
                break;
            }

        }

        return new int[]{ansStart, ansEnd};
    }

    static class Node implements Comparable<Node> {
        int data;
        int row;
        int col;

        Node(int data, int row, int col) {
            this.data = data;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Node node) {
            return this.data - node.data;
        }
    }
}

