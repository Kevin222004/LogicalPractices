///*
//
//  |src | 0  |  0  | 0   |   0  |  1  |     0 --> you can't go path is blocked
//  |rat |    |     |     |      |     |     1 --> you can go through that path
//  ------------------------------------     // figure is just for understanding
//  |  1 |  0 |  1  |  0  |  1   |   1 |
//  |    |    |     |     |      |     |
//  ------------------------------------
//  | 1  |  1 |  1  | 0   |  1   | 1   |
//  |    |    |     |     |      |     |
//  ------------------------------------
//  |    |    |     |     |      |     |
//  | 1  | 1  |  1  |  0  |  0   |  1  |
//  ------------------------------------
//  |    |    |     |     |      |     |
//  |  1 | 1  |  1  |  1  |  0   | 0   |
//  ------------------------------------
//  |    |  0 |  0  | 1   |   1  | dest|
//  | 0  |    |     |     |      |     |
//
//  find all the solution to reach the destination
//  Rat can move up, down, left, right
//
//solution
//ek case khud karo baki recursion will do
//
//
//
//*/allowedDistance
//
//
/*

 */
package RecursionAndBackTracking.DNCAndBack.l3;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0},
                {1, 1, 0},
                {1, 1, 1}};

        // edge case what if source index == 0;
        if (maze[0][0] == 0) {
            System.out.println("No path exist");
            return;
        }

        int row = 3, col = 3;
        boolean[][] visited = new boolean[row][col];
        visited[0][0] = true;
        List<String> path = new ArrayList<>();
        StringBuilder output = new StringBuilder("");

        solveMaze(maze, row, col, 0, 0, visited, path, output);

        System.out.println(path);
    }

    static void solveMaze(int[][] arr, int row, int col, int i, int j,  // i = srcX, j = srcY
                          boolean[][] visited, List<String> path, StringBuilder output) {

        // basecase
        if (i == row - 1 && j == col - 1) {
            path.add(output.toString());
            return;
        }

        // down --> i+1, j
        if (isSafe(i + 1, j, row, col, arr, visited)) {
            visited[i + 1][j] = true;
            solveMaze(arr, row, col, i + 1, j, visited, path, output.append("D"));
            visited[i + 1][j] = false; // backtrack
            output.deleteCharAt(output.length() - 1); // backtrack this as well
        }

        // left --> i, j-1
        if (isSafe(i, j - 1, row, col, arr, visited)) {
            visited[i][j - 1] = true;
            solveMaze(arr, row, col, i, j - 1, visited, path, output.append("L"));
            visited[i][j - 1] = false;
            output.deleteCharAt(output.length() - 1);
        }

        // right --> i, j+1
        if (isSafe(i, j + 1, row, col, arr, visited)) {
            visited[i][j + 1] = true;
            solveMaze(arr, row, col, i, j + 1, visited, path, output.append("R"));
            visited[i][j + 1] = false;
            output.deleteCharAt(output.length() - 1);
        }

        // up   --> i-1, j
        if (isSafe(i - 1, j, row, col, arr, visited)) {
            visited[i - 1][j] = true;
            solveMaze(arr, row, col, i - 1, j, visited, path, output.append("U"));
            visited[i - 1][j] = false;
            output.deleteCharAt(output.length() - 1);
        }

    }

    static boolean isSafe(int i, int j, int row, int col, int[][] arr, boolean[][] visited) {
        if (((i >= 0) && (i < row)) && (j >= 0 && j < col) && (arr[i][j] == 1 && !visited[i][j])) {
            return true;
        } else {
            return false;
        }
    }
}
