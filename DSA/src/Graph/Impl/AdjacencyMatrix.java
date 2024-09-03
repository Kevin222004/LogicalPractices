package Graph.Impl;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the total nodes
        System.out.println("Enter the number of Nodes");
        int nodes = sc.nextInt();

        // create adjacency matrix
        int[][] AdjacencyMatrix = new int[nodes][nodes];

        // input the total edges
        System.out.println("Enter the number of Edges");
        int edges = sc.nextInt();

        // take u, v as input and store it in matrix
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the vertices which have edges");
            System.out.print("Enter the v1: ");
            int u = sc.nextInt();
            System.out.print("Enter the v2: ");
            int v = sc.nextInt();
            AdjacencyMatrix[u][v] = 1;
        }
        System.out.println();
        // print graph or adjacency matric
        System.out.println("Graph");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                System.out.print(AdjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
