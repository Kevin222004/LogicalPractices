/*
Next smaller Element

array will be given
arr = {2, 1, 4, 3};
for 2 in left side which is the smallest element -> 1
for 1 in left side which is the smallest element -> -1
for 4 in left side which is the smallest element -> 3
for 3 in left side which is the smallest element -> -1

solve this in n complexity

*/

package Stack.prac;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3};
        System.out.println(Arrays.toString(NextSmallerElement(array)));
    }

    static int[] NextSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        stack.add(-1);
        for (int i = ans.length - 1; i >= 0; i--) {
            int curElement = arr[i];
            while (stack.peek() >= curElement) {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(curElement);
        }

        return ans;
    }

}
