package Heaps.l3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergekSortedArray {
    public static void main(String[] args) {
        List<List<Integer>> KsortedArray = new ArrayList<>();
        KsortedArray.add(List.of(2, 4, 6, 8));
        KsortedArray.add(List.of(1, 3, 5, 7, 12));
        KsortedArray.add(List.of(0, 9, 10, 11));
        List<Integer> ans = mergeKsortedArray(KsortedArray);
        System.out.println(ans);
    }

    static List<Integer> mergeKsortedArray(List<List<Integer>> KsortedArray) {
        PriorityQueue<Info> heap = new PriorityQueue<>(Info::compareTo);
        for (int i = 0; i < KsortedArray.size(); i++) {
            heap.add(new Info(KsortedArray.get(i).get(0), i, 0));
        }

        List<Integer> ans = new ArrayList<>();

        while (!heap.isEmpty()) {
            Info node = heap.peek();
            ans.add(node.value);
            heap.poll();
            if (node.col + 1 < KsortedArray.get(node.row).size()) {
                Info addVal = new Info(KsortedArray.get(node.row).get(node.col + 1), node.row, node.col + 1);
                heap.add(addVal);
            }
        }
        return ans;
    }

    static class Info implements Comparable<Info> {
        int value;
        int row;
        int col;

        public Info(int value, int row, int col) {
            this.value = value;
            this.col = col;
            this.row = row;
        }

        @Override
        public int compareTo(Info info) {
            return this.value - info.value;
        }
    }
}