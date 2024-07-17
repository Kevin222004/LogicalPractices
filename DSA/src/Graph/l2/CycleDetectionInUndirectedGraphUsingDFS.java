package Graph.l2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CycleDetectionInUndirectedGraphUsingDFS {

    static Map<Integer, Boolean> visited = new HashMap<>();

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, false);
        g.addEdge(1, 2, false);
        g.addEdge(0,2, false);
        int n = 3;
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            if (!visited.containsKey(i)) {
                ans = g.detectCycleDFS(i, -1);
                if (ans) {
                    break;
                }
            }
        }

        if (ans) {
            System.out.println("Cycle is present");
        }
        else {
            System.out.println("Cycle is not present");
        }
    }

    static class Graph {

        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        void addEdge(int u, int v, boolean directed) {
            if (!adjacencyList.containsKey(u)) {
                adjacencyList.put(u, new ArrayList<>());
            }
            adjacencyList.get(u).add(v);
            if (!directed) {
                if (!adjacencyList.containsKey(v)) {
                    adjacencyList.put(v, new ArrayList<>());
                }
                adjacencyList.get(v).add(u);
            }
        }

        boolean detectCycleDFS(int node, int parent) {
            visited.put(node, true);

            for (int neighbor : adjacencyList.get(node)) {
                if (!visited.containsKey(neighbor)) {
                    boolean checkAgeKaAns = detectCycleDFS(neighbor, node);
                    if (checkAgeKaAns) {
                        return true;
                    }
                }
                else if (neighbor != parent) {
                    return true;
                }
            }

            return false;
        }

    }
}
