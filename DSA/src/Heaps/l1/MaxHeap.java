package Heaps.l1;

import java.util.ArrayList;
import java.util.*;

public class MaxHeap {

    public ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    public int left(int index) {
        return index*2 + 1;
    }

    public int right(int index) {
        return (2*index)+2;
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

/* --------------------------------  insertion ------------------------------------*/
    void insert(int value) {
        list.add(value);
        upheap(list.size()-1);
    }

    void upheap(int index) {
        if (index == 0) {
            return;
        }
        int parent = parent(index);
        if (list.get(index) > list.get(parent)) {
            swap(parent, index);
            upheap(parent);
        }
    }


    /* --------------------------------  deletion ------------------------------------*/

    public int delete() {
        int val = list.get(0);
        list.set(0, list.size()-1);
        list.remove(list.size()-1);

        int index = 0;
        while (index < list.size()) {
            int left = left(index);
            int right = right(index);
            int largest = index;

            // we find the largest element in index, left, right
            if (left < getList().size() && list.get(largest) < list.get(left)){
                largest = left;
            }
            if (right < getList().size() && list.get(largest) < list.get(right)){
                largest = right;
            }
            // we find the largest number in left right and index

            if (largest == index) {
                break;
            }
            else {
                swap(index, largest);
                index = largest;
            }

        }
        return val;
    }

}
