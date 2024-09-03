package Heaps.l1;

public class Main {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.insert(100);
        heap.insert(50);
        heap.insert(60);
        heap.insert(40);
        heap.insert(45);
        heap.insert(53);
        heap.insert(52);

        System.out.println(heap.getList());
//        heap.insert(110);
        System.out.println(heap.delete());
        System.out.println(heap.getList());
    }
}
