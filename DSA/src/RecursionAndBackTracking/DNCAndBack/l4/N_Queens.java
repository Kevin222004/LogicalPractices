package RecursionAndBackTracking.DNCAndBack.l4;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int col = 0;
        int n = 4;
        solve(arr, col, n);
    }

    static void solve(int[][] board, int col, int n) {
         // base case
        if (col >= n) {
            print(board, n);
            return;
        }

        // 1 case solve karna he baki recursion solve karlega
        for (int row = 0; row < n; row++){
            if (isSafe(row, col, board, n)) {
                board[row][col] = 1;
                // recursion
                solve(board, col+1, n);
                //backtrack
                board[row][col] = 0;
            }
        }

    }

    static boolean isSafe(int row, int col, int[][] borad, int n) {
        // check karna he, k kya main current cell [row, col] pr Queen rakh sakta hu ki nahi
        int i = row, j = col;
        // check row
        while (j>=0) {
            if(borad[i][j] == 1) {
                return false;
            }
            j--;
        }

        // check upperleft diagonal
        i = row; j = col;
        while (i>=0&&j>=0) {
            if (borad[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        // check bottom right diagonal
        i = row; j = col;
        while ( i< n && j >= 0) {
            if (borad[i][j] == 1) {
                return false;
            }
            i++;
            j--;
        }

        // kahin per bhi queen nahi mili pos safe
        return true;
    }

    static void print(int[][] board, int n) {
        for (int i = 0;  i < n; i++) {
            for (int j = 0; j < n; j++ ) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
