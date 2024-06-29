package Recursion;

public class MinElementoRequiretarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 5;

    }

    public int minele(int[] arr, int target) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ans = minele(arr, target - arr[i]);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1);
            }
        }
        return mini;
    }
}
