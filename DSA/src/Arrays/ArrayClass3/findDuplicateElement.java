/*
LeetCode - 287
Find the duplicate

Method-1 :- Sort and i position always point to same if not then duplicate

Method-2 :- Negative Marking method (Array is getting modified)

Method-3 :- Posisionting methid

*/

package Arrays.ArrayClass3;

public class findDuplicateElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 2};
        System.out.println(FindDuplicatee(arr));
    }

    // brute force
    static int FindDuplicate(int[] arr) {
        int ans = -1;
        int point;
        for (int i = 0; i < arr.length; i++) {
            point = arr[i];
            for (int j= i+1; j < arr.length; j++) {
                if (arr[j] == point) {
                    return arr[j];
                }
            }
        }
        return ans;
    }

    // negative marking method array is getting modifed
    static int FindDuplicate2(int[] arr) {
        int ans = -1;
        for (int i =0; i< arr.length; i++) {
            int index = arr[i];
            if (index < 0) {
                index = index * -1;
            }

            // already visited
            if(arr[index] < 0) {
                ans = index;
                break;
            }

            // mark negative
            arr[index] *= -1;
        }
        return ans;
    }

    // Method 3 --> positioning method
    static int FindDuplicatee(int[] arr) {
        while (arr[0] != arr[arr[0]]) {
            int temp = arr[arr[0]];
            arr[arr[0]] = arr[0];
            arr[0] = temp;
        }
        return arr[0];
    }

}
