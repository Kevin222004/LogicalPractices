/*
    we will mark the index as negative as we iterate the array

*/
package Arrays.Assign;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4};

    }
        public int findDuplicate(int[] nums) {
            int ans = -1;

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]);

                // if already
                if (nums[index] < 0) {
                    ans = index;
                    break;
                }

                // visited mark
                nums[index] *= -1;
            }
            return ans;
        }

}
