package Heaps.l1;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {-1, 100, 50, 60, 20, 30};
        System.out.println(Arrays.toString(arr));
        heapSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void heapSort(int[] arr, int n) {
        int index = n;
        while (n != 1) {
            swap(1, index, arr);
            index--;
            n--;
            heapify(arr, n, 1);
        }
    }

    static void heapify(int[] arr, int size, int i) {
        int index = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest = index;

        // we find the largest element in index, left, right
        if (left <= size && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right <= size && arr[largest] < arr[right]) {
            largest = right;
        }
        // we find the largest number in left right and index

        if (largest != index) {
            swap(index, largest, arr);
            index = largest;
            heapify(arr, size, index);
        }

    }

    private static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
