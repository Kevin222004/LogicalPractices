/*
Problem :- Find unique element

Every element occurs 1 time but only 1 is their which come 1 find that

*/

package DSA.src.Arrays.ArrayClass2;

public class UniqueElement {

    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4};
        System.out.println(uniqueElementUsingXor(arr));

    }

    public static int uniqueElementUsingXor(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result = result ^ j;
        }
        return result;
    }

}
