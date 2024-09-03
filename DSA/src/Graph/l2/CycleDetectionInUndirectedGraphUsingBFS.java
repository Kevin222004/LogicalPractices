package Graph.l2;

import java.util.*;

public class CycleDetectionInUndirectedGraphUsingBFS {

    private static Map<Integer, Boolean> visited = new HashMap<>();


    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, false);
        g.addEdge(1, 2, false);
        g.addEdge(0, 2, false);
        int n = 3;
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            if (!visited.containsKey(i)) {
                ans = g.checkCycleUsingBFS(i);
                if (ans) {
                    break;
                }
            }
        }

        if (ans) {
            System.out.println("Cycle is present");
        } else {
            System.out.println("Cycle is not present");
        }

    }

    private static class Graph {
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

        //----------------------------checkCycleUsingBFS---------------------------//
        boolean checkCycleUsingBFS(int node) {
            Queue<Integer> queue = new ArrayDeque<>();
            Map<Integer, Integer> parent = new HashMap<>();
            queue.add(node);
            visited.put(node, true);
            parent.put(node, -1);

            while (!queue.isEmpty()) {
                int currNode = queue.poll();

                for (int neighbor : adjacencyList.get(currNode)) {
                    // not visited
                    if (!visited.containsKey(neighbor)) {
                        queue.add(neighbor);
                        visited.put(neighbor, true);
                        parent.put(neighbor, currNode);
                    } else {
                        // already visited
                        if (neighbor != parent.get(currNode)) {
                            // cycle present
                            return true;
                        }
                    }
                }
            }
            return false;
        }

    }
}
