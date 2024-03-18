package stack;

public class StackImpl {

    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(5);stack.push(4);stack.push(3);stack.push(2);stack.push(1);
        stack.printStack();
    }

    static class myStack {

        static int[] data;

        int DEFAULT_SIZE = 10;

        static int ptr = -1;

        myStack(int size) {
            data = new int[size];
        }

        myStack() {
            data = new int[DEFAULT_SIZE];
        }

        public static boolean push(int datad ) {
            if (isFUll()) {
                return false;
            }
            ptr++;
            data[ptr] = datad;
            return true;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = data[ptr];
            ptr--;
            return value;
        }

        public static boolean isFUll() {
            System.out.println(ptr);
            return ptr == data.length;
        }

        public static boolean isEmpty() {
            if (ptr == -1) {
                return true;
            }
            else {
                return false;
            }
        }

        static void printStack() {
            for (int d : data) {
                System.out.print(d + " ");
            }
        }
    }
}
