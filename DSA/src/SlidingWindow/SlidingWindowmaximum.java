/*

fixed sized window pattern

we can also solve this using array as well

https://leetcode.com/problems/sliding-window-maximum/

 */

package SlidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowmaximum {
    public static void main(String[] args) {
        int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(input, k)));
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        // Process the first k elements
        for (int i = 0; i < k; i++) {
            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        // Process the rest of the elements
        for (int i = k; i < nums.length; i++) {
            // Add the maximum element of the current window to the result
            result[i - k] = nums[deque.peekFirst()];

            // Remove elements from the front of the deque that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);
        }

        // Add the maximum element of the last window to the result
        result[nums.length - k] = nums[deque.peekFirst()];

        return result;
    }
}
