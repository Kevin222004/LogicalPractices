/*
 
https://www.spoj.com/problems/DEFKIN/

 */

package Greedy;

import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class DefkinProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int t = n;
        List<Integer> rowC = new ArrayList<>();
        List<Integer> colC = new ArrayList<>();
        rowC.add(-1); colC.add(-1);
        while (t>0) {
            int a;
            int b;
            a = sc.nextInt();
            b = sc.nextInt();

            rowC.add(a);
            colC.add(b);
            t--;
        }

        rowC.add(n);
        colC.add(n);

        Collections.sort(rowC);
        Collections.sort(colC);

        int maxLen = Integer.MIN_VALUE;
        for (int i = 1; i <rowC.size(); i++ ) {
            int a = rowC.get(i-1);
            int b = rowC.get(i);

            if (a==-1) {
                maxLen = Math.max(maxLen, b);
            }
            else {
                maxLen = Math.max(maxLen, b-a-1);
            }
        }


        int maxWidth = Integer.MIN_VALUE;
        for (int i = 1; i <colC.size(); i++ ) {
            int a = colC.get(i-1);
            int b = colC.get(i);

            if (a==-1) {
                maxWidth = Math.max(maxWidth, b);
            }
            else {
                maxWidth = Math.max(maxWidth, b-a-1);
            }
        }
        
        System.out.println(maxLen*maxWidth);
    }
}
