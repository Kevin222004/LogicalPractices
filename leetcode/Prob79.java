package leetcode;

public class Prob79 {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        Solution79 sol = new Solution79();
        System.out.println(sol.exist(board,"ABCCED" ));
    }
}

class Solution79 {
    public boolean exist(char[][] board, String word) {
        StringBuilder str = new StringBuilder();
        return solve(board, word, str, 0, 0, board.length, board[0].length);
    }

    boolean solve(char[][] board, String word, StringBuilder output,int current_row, int current_col ,int row, int col) {
        if ((output.toString()).equals(word)) {
            return true;
        }
        if (current_col < 0 || current_row < 0) {
            return false;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[current_row][current_col] != '.')
                {// right
                    if (current_col + 1 < col) {
                        char temp = board[current_row][current_col];
                        output.append(board[current_row][current_col]);
                        board[current_row][current_col] = '.';
                        solve(board, word, output, current_row, current_col + 1, row, col);
                        output.deleteCharAt(output.length() - 1);
                        board[current_row][current_col] = temp;
                    }
                    // up
                    if (current_row - 1 >= 0) {
                        char temp = board[current_row][current_col];
                        output.append(board[current_row][current_col]);
                        board[current_row][current_col] = '.';
                        solve(board, word, output, current_row - 1, current_col, row, col);
                        output.deleteCharAt(output.length() - 1);
                        board[current_row][current_col] = temp;
                    }
                    // down
                    if (current_row + 1 < row) {
                        char temp = board[current_row][current_col];
                        output.append(board[current_row][current_col]);
                        board[current_row][current_col] = '.';
                        solve(board, word, output, current_row + 1, current_col, row, col);
                        output.deleteCharAt(output.length() - 1);
                        board[current_row][current_col] = temp;
                    }
                    // left
                    if (current_col - 1 < col) {
                        char temp = board[current_row][current_col];
                        output.append(board[current_row][current_col]);
                        board[current_row][current_col] = '.';
                        solve(board, word, output, current_row, current_col - 1, row, col);
                        output.deleteCharAt(output.length() - 1);
                        board[current_row][current_col] = temp;
                    }
                }
            }
        }


        return true;
    }
}
