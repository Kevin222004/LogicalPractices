/*

2 Stacks in an 1 array

one array => 2 stack

what idea cames into mind simple one that divide array in half part but not efficent

second way start 1st pointer from 0 and 2nd pointer from arr.length-1;






*/

package Stack.prac;

public class twostackinonearray {
    public static void main(String[] args) {
        cusStack stack = new cusStack();
        stack.push1(4);
        stack.push1(3);
        stack.push1(2);
        stack.push1(1);
//        stack.printStack1();
//        System.out.println();
        stack.pop1();
//        stack.printStack1();
//        System.out.println();
        stack.push2(4);
        stack.push2(3);
        stack.push2(2);
        stack.push2(1);
        stack.printStack2();
        System.out.println();
        stack.pop2();
        stack.printStack2();
//        stack.printFullStack();

    }
}

class cusStack {

    protected static int[] data;

    static int Size = 10;

    static int ptr1 = -1;
    static int ptr2 = Size;

    cusStack(int size) {
        Size = size;
        data = new int[size];
    }

    cusStack() {
        data = new int[Size];
    }

    public static void push1(int adddata) {
        if (ptr2 - ptr1 == 1) {
            System.out.println("Stack is full");
            return;
        }
        ptr1++;
        data[ptr1] = adddata;
    }

    public static void push2(int adddata) {
        if (ptr2 - ptr1 == 1) {
            System.out.println("Stack is full");
            return;
        }
        ptr2--;
        data[ptr2] = adddata;
    }

    public static int pop1() {
        if (ptr1 == -1) {
            System.out.println("stack1 is empty");
        }
        int returnValue = data[ptr1];
        ptr1--;
        return returnValue;
    }

    public static int pop2() {
        if (ptr2 == Size) {
            System.out.println("stack2 is empty");
        }
        int returnValue = data[ptr2++];
        return returnValue;
    }

    public static void printStack1() {
        for (int i = 0; i <= ptr1; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void printStack2() {
        for (int i = ptr2; i < Size; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void printFullStack() {
        System.out.println("=========");
        for (int d : data) {
            System.out.print(d + " ");
        }
    }
}
