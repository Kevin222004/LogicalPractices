/*

leetCode :- 155 minStack
https://leetcode.com/problems/min-stack/description/



*/

package Stack.babbar;

import java.util.ArrayList;
import java.util.List;

public class MainMinStack {
    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(0);
        min.push(1);
        min.push(0);
        System.out.println(min.getMin());
        min.pop();
        System.out.println(min.getMin());

        System.out.println(min.top());
    }
}

class MinStack {

    List<List<Integer>> list = new ArrayList<>();

    int size = -1;

    public MinStack() {
    }

    public void push(int val) {
        if (list.isEmpty()) {
            list.add(List.of(val, val));
            size++;
        } else {
            int min = Integer.min(val, getCurrentMin());
            list.add(List.of(val, min));
            size++;
        }
    }

    public int getCurrentMin() {
        if (!list.isEmpty()) {
            return list.get(size).get(1);
        }
        return -1;
    }

    public void pop() {
        if (!list.isEmpty()) {
            list.remove(size);
            size--;
        }
    }

    public int top() {
        return list.get(size).get(0);
    }

    public int getMin() {
        return getCurrentMin();
    }
}

/**
 * Your MainMinStack object will be instantiated and called as such:
 * MainMinStack obj = new MainMinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */