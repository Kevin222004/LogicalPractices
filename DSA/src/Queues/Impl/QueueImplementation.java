///  First In First out OR last in last out

package DSA.src.Queues.Impl;

import java.util.Arrays;

public class QueueImplementation {

    public static void main(String[] args) {
        customQueue queue = new customQueue();
        queue.insertData(1);
        queue.insertData(2);
        queue.insertData(3);
        queue.insertData(4);
        queue.insertData(5);
        queue.insertData(6);
        queue.insertData(7);
        queue.insertData(8);
        queue.insertData(9);
        queue.insertData(10);
        queue.print();
    }

    private static class customQueue {
        private int[] data;

        private int defaultSize  = 10;

        int end = -1;

        public customQueue(int size) {
            data = new int[size];
        }

        public customQueue() {
            data = new int[defaultSize];
        }

        public boolean insertData(int dataa) {
            if (!isFull()) {
                end++;
                data[end] = dataa;
                return true;
            }
            return false;
        }

        public int deleteData() {
            int ans = data[0];

            for (int i = 1; i <= end; i++) {
                data[i-1] = data[i];
            }
            end--;
            return ans;
        }

        public void print() {
            for (int i = 0; i <= end; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        private boolean isFull() {
            return end == data.length - 1;
        }

        private boolean isEmpty() {
            return end == -1;
        }
    }
}
