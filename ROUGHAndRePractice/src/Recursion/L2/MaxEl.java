package Recursion.L2;

public class MaxEl {
    public static void main(String[] args) {
        int[] arr = {10,50, 20, 30 , 40};
        System.out.println(Maxelement(arr, 0));
    }
    public static int Maxelement(int[] arr, int index) {
        if (index >= arr.length) {
            return Integer.MIN_VALUE;
        }
        int element = Maxelement(arr, index+1);
        return Math.max(arr[index], element);
    }
}
