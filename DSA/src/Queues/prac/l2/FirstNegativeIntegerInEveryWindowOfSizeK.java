/*

input
12, -1, -7, 8, -15, 30, 16, 28
window size
k = 3
output
-1, -1, -7, -15, -15, 0

 */

package DSA.src.Queues.prac.l2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        sol(arr, k);
    }

    /*

    Not working solve again

     */

    public static void sol(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        int curr = 0;

//        process first window of size k
        for (int i = 0; i < 3; i++) {
            if (arr[i] < 0) {
                q.add(i);
                curr++;
            }
        }

        // remaining window ko process karo
        for (int i = k; i < arr.length; i++) {
            // answer dedo purane window ka
            if (q.isEmpty()) {
                System.out.print(0 + " ");
            }
            else {
                System.out.print(arr[q.peek()] + " ");
            }

            // out of window element ko remove kardo
            while ((!q.isEmpty()) && (i - q.peek() >= k)) {
                q.poll();
            }

            // check current elemnt for insertion
            if (arr[i] < 0) {
                q.add(i);
            }

            // answer print karo for last window
            if (q.isEmpty()) {
                System.out.print(0 + " ");
            }
            else {
                System.out.print(arr[q.peek()] + " ");
            }
        }
    }
}
