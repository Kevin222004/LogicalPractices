/*

Method 1 - sorting

Method 2 -  counting method {count 0 1 and 3 and then spread it in array but we have to do inplace solution }

Method 3 - 3 pointer


 */

package DSA.src.Arrays.Assign;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int hig = nums.length-1;
        while (mid <= hig) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] =nums[mid] ;
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] =nums[hig] ;
                nums[hig] = temp;
                hig--;
            }
        }
    }

}
