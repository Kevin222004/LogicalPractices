/*
 
Array represent the number of chocolate in n different packet

their are m student 

distribute the choclates to m stident such that every student get exactly 1 packet
and difference between max of chocolate given to a student && minimum np of cocolate given to a student 
is minimum

 */

package Greedy;

import java.util.Arrays;

public class choclate {
    public static void main(String[] args) {
        int n = 8;
        int m = 5;
        int[] choclates = {3, 4, 1, 9, 56, 7, 9, 12};

        int mini = Integer.MAX_VALUE;

        Arrays.sort(choclates);

        int start = 0;
        int end = m - 1;

        while (end < choclates.length) {
            int diff = choclates[end] - choclates[start];
            mini = Math.min(mini, diff);
            start++;
            end++;
        }

        System.out.println(mini);
    }
}
