/*

Min heap

*/
package Heaps.Impl;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    private void swap(int first, int second) {
        int temp = heap.get(first);
        heap.set(first, heap.get(second));
        heap.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(int value) {
        heap.add(value);
        upheap(heap.size() - 1);
    }

    private void upheap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(heap.get(index).compareTo(heap.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public int remove() throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        int temp = heap.get(0);

        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            downheap(0);
        }

        return temp;
    }
    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < heap.size() && heap.get(min).compareTo(heap.get(left)) > 0) {
            min = left;
        }

        if(right < heap.size() && heap.get(min).compareTo(heap.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<Integer> heapSort() throws Exception {
        ArrayList<Integer> data = new ArrayList<>();
        while(!heap.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}