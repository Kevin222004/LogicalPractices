/*
 
Their is an offer in a lollipop shop 

their is an array of price 

offer is on 1 lollipop you got 2 lollipop free know spend minimum and purchase everything

 */

package Greedy;

import java.util.Arrays;

public class lollipop {
    public static void main(String[] args) {
        int[] price = {2, 9, 8, 4, 6, 7};
        System.out.println(amountToPurcaseAllLollipop(price));
    }

    public static int amountToPurcaseAllLollipop(int[] arr) {
        int totalPrice = 0;
        int i = 0;
        int j = arr.length - 1;

        Arrays.sort(arr);

        while (i <= j) {
            totalPrice += arr[i];
            i++;
            j = j - 2;
        }


        return totalPrice;
    }

}
