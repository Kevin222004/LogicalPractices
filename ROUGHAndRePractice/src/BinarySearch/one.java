package BinarySearch;

public class one {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] arr = {1, 3, 5, 7,  12, 35, 67, 89};
//        System.out.println(bst.searchindex(arr, 89));
//        System.out.println(bst.firstOcuurence(new int[]{1, 2, 3, 4, 4, 4, 4, 4}, 4));
//        System.out.println(bst.lastOcuurence(new int[]{1, 2, 3, 4, 4, 4, 4, 4}, 4));
//        System.out.println(bst.peakElementInMountainArray(new int[]{ 1,2,3,1}));
        System.out.println(bst.squareRoot(65));
    }
}

class BST {

    public int squareRoot(int num) {
        int s = 0;
        int e = num;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e-s)/2;
            int sqr = (mid * mid);

            if (sqr == num) {
                ans = mid;
                break;
            }
            
            else if (sqr < num) {
                s = mid+1;
            } else{
                ans = mid;
                e = mid -1;
            }
        }
        return ans;
    }

    public int peakElementInMountainArray(int[] arr) {
        // 1,2,3,1
        int s =0;
        int e = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while (s <= e) {
            int m = s + (e-s)/2;

            if (arr[m-1] < arr[m] && arr[m+1] < arr[m]) {
                ans = Math.max(ans, arr[m]);
                s = m+1;
            }
            else if (arr[m-1] < arr[m] && arr[m] < arr[m+1]) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
        return ans;
    }

    public int searchindex(int[] arr, int element) {
        int s = 0;
        int e = arr.length-1; // remember this
         while (s <= e) {
             int m = s + ((e-s)/2);

             if (element == arr[m]) {
                 return m;
             } else if (arr[m] > element) {
                 e = m - 1;
             }
             else {
                 s = m + 1;
             }

         }
         return -1;
    }

    // find te first occurence of elemnt
    public int firstOcuurence(int[] arr, int ele) {
        int s = 0;
        int e = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (s <= e) {
            int m = s + ((e-s)/2);

            if (arr[m] == ele) {
                ans = Math.min(ans, m);
                e = m -1 ;
            }
            else if (ele < arr[m]) {
                e = m -1;
            }
            else {
                s = m + 1;
            }
        }
        return ans;
    }

    // find te last occurence of elemnt
    public int lastOcuurence(int[] arr, int ele) {
        int s = 0;
        int e = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while (s <= e) {
            int m = s + ((e-s)/2);

            if (arr[m] == ele) {
                ans = Math.max(ans, m);
                s = m +1 ;
            }
            else if (ele < arr[m]) {
                e = m -1;
            }
            else {
                s = m + 1;
            }
        }
        return ans;
    }

    public int totalOccurence(int[] arr, int ele)  {
        return lastOcuurence(arr, ele) - firstOcuurence(arr, ele) + 1;
    }

    // smallest missingelemtn in sorted elemtn
    public int smallest_missing_element(int[] arr) {
        // ex input 1, 2, 3, 4, 6, 7, 8
        int s = 0;
        int e = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == m + 1) {
                s = m + 1;
            } else {
                ans = m;
                e = m-1;
            }
        }
        return ans+1;
    }
}