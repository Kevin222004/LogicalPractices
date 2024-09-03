package Searching.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {6, 12, 6, 22, 21, 6, 3, 52, 442, 342, 42};
        System.out.println(linearSearch(arr, 6));
    }

    static boolean linearSearch(int[] arr, int targetElement) {
        boolean result = false;
        for (int j : arr) {
            if (j == targetElement) {
                result = true;
                break;
            }
        }
        return result;
    }
}
