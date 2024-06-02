/*

probelm:-  37. Sudoku Solver

*/
package leetcode;

import java.util.Arrays;

public class Prob37 {
    public static void main(String[] args) {
        char[][] arr = {{'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '3', '6', '.', '.', '.', '.', '.'}, {'.', '7', '.', '.', '9', '.', '2', '.', '.'}, {'.', '5', '.', '.', '.', '7', '.', '.', '.'}, {'.', '.', '.', '.', '4', '5', '7', '.', '.'}, {'.', '.', '.', '1', '.', '.', '.', '3', '.'}, {'.', '.', '1', '.', '.', '.', '.', '6', '8'}, {'.', '.', '8', '5', '.', '.', '.', '1', '.'}, {'.', '9', '.', '.', '.', '.', '4', '.', '.'}};

        Solution37 solution37 = new Solution37();
        solution37.solveSudoku(arr);
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution37 {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        solve(board, board.length);
    }


    boolean solve(char[][] board, int n) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {

                    for (char val = '1'; val <= '9'; val++) {
                        if (isSafe(board, n, i, j, val)) {
                            board[i][j] = val;
                            boolean next = solve(board, n);
                            if (next == true) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isSafe(char[][] board, int n, int row, int col, int value) {
        // row, col, 3X3 matric
        for (int i = 0; i < n; i++) {
            if(board[row][i] == value) {
                return false;
            }

            if(board[i][col] == value) {
                return false;
            }

            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)] == value) {
                return false;
            }

        }

        return true;
    }
}

