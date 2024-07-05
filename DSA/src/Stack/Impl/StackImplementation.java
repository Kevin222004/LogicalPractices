// LastIn firstOut or firstIn lastOut

// come back after watching object oriented here again to implement the dynamic stack

package Stack.Impl;

public class StackImplementation {

    public static void main(String[] args) {

        StackImpl stack = new StackImpl(5);
        stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);
        System.out.println(stack);


    }

}

class StackImpl {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public StackImpl(int size) {
        data = new int[size];
    }

    public StackImpl() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is FUll");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Already Empty");
            return -1;
        }
        int val = data[ptr];
        ptr--;
        return val;
    }

    public int peek() {
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}