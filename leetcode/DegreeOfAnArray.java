package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DegreeOfAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] N = new int[T];
        for (int i = 0; i < T; i++) {
            N[i] = scanner.nextInt();
        }
        System.out.println(findSmallestSubarray(N));
    }

    private static int findSmallestSubarray(int[] N) {
        Map<Integer, Integer> frequency = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int maxFrequency = 0;
        for (int i = 0; i < N.length; i++) {
            if (frequency.containsKey(N[i])) {
                frequency.put(N[i], frequency.get(N[i]) + 1);
                lastIndex.put(N[i], i);
            } else {
                frequency.put(N[i], 1);
                firstIndex.put(N[i], i);
                lastIndex.put(N[i], i);
            }
            maxFrequency = Math.max(maxFrequency, frequency.get(N[i]));
        }
        int minLength = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                minLength = Math.min(minLength, lastIndex.get(entry.getKey()) - firstIndex.get(entry.getKey()) + 1);
            }
        }
        return minLength;
    }
}