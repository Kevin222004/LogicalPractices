// please check once cose is right test pending

package Heaps.l1;

import java.util.Arrays;

public class BuildAHeapFromArray {
    public static void main(String[] args) {
        int[] arr = {-1, 12, 15, 13, 11, 14};
        int n = arr.length-1;
        System.out.println(Arrays.toString(arr));
        for (int i = n/2; i > 0; i--) {
             heapify(arr,n , i );
        }
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] arr, int size,int i){
        int index = i;
        int left = 2*i ;
        int right = 2*i+1;
        int largest = index;

        // we find the largest element in index, left, right
        if (left <= size && arr[largest] < arr[left]){
            largest = left;
        }
        if (right <= size && arr[largest] < arr[right]){
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
