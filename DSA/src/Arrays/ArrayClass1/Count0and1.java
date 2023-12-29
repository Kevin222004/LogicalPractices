package Arrays.ArrayClass1;

public class Count0and1 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1};
        int[] ans = count0And1(arr);
        System.out.println("Zero : " + ans[0] + "\n ones : " + ans[1]);

    }

    public static int[] count0And1(int[] arr) {
        int[] result = new int[2];
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
            else {
                one++;
            }
        }
        result[0] = zero; result[1] = one;
        return result;
    }
}
