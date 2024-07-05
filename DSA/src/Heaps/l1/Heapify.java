package Heaps.l1;

public class Heapify {
    public static void main(String[] args) {

    }

    void heapify(int[] arr, int size,int i){
        int index = i;
        int left = 2*i + 1;
        int right = 2*i+2;
        int largest = index;

        // we find the largest element in index, left, right
        if (left < size && arr[largest] < arr[left]){
            largest = left;
        }
        if (right < size && arr[largest] < arr[right]){
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
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
