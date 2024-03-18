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
//  |    |  0 |  0  | 0   |   0  | dest|
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
//package RecursionAndBackTracking.back;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RatInMaze {
//    public static void main(String[] args) {
//        int[][] maze = { {1, 0, 0},
//                         {1, 1, 0},
//                         {1, 1, 1}};
//        int row = 3, col = 3;
//
//        boolean[][] visited = new boolean[row][col];
//        visited[0][0] = true;
//    }
//}
