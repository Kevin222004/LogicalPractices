/*

Method 1 - sorting

Method 2 -  counting method {count 0 1 and 3 and then spread it in array but we have to do inplace solution }

Method 3 - 3 pointer


 */

package Arrays.Assign;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

    }

    static void sort(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int m = 0;

        while (m <= high) {
            if (arr[m] == 0) {
                swap(arr[low], arr[m]);
                low++;
                m++;
            }
            else if (arr[m] == 1) {
                m++;
            }
            else if (arr[m] ==2 ) {
                swap(arr[m], arr[high]);
                high--;
                m++;
            }
        }
    }

    static void swap(int i, int j ) {
        int temp = i;
        i = j;
         j = temp;
    }
}
