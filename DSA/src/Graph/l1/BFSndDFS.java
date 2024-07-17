package Graph.l1;

import java.util.*;

public class BFSndDFS {
    static Map<Integer, Boolean> visited = new HashMap<>();
    static Map<Integer, Boolean> visited2 = new HashMap<>();
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS();
        g.addEdge(0, 1, false);
        g.addEdge(1, 3, false);
        g.addEdge(0, 2, false);
        g.addEdge(2, 4, false);


        // handle all the component in graph if any 1 is disconnected
        System.out.println("BFSndDFS: ");
        for (int i = 0; i < 5; i++) {
            if (!visited.containsKey(i)) {
                g.BFS(i);
            }
        }
        System.out.println();


        // handle all the component in graph if any 1 is disconnected
        System.out.println("DFS: ");
        for (int i = 0; i < 5; i++) {
            if (!visited2.containsKey(i)) {
                g.DFS(i);
            }
        }
        System.out.println();
    }

    static class GraphBFS {
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

        void printAdjacencyList() {
            for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
                System.out.println("Adjacency list of vertex " + entry.getKey() + " is " + entry.getValue());
            }
        }

        void BFS(int node) {
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(node);
            visited.put(node, true);

            while (!queue.isEmpty()) {
                // remove the node from queue
                int currNode = queue.poll();

                // print the node
                System.out.print(currNode + " ");

                // add the connected nodes of currNode to the queue if not visited
                for (int neighbor : adjacencyList.get(currNode)) {
                    if (!visited.containsKey(neighbor)) {
                        queue.add(neighbor);
                        visited.put(neighbor, true);
                    }
                }
            }
        }

        void DFS(int node) {
            System.out.print(node + " ");
            visited2.put(node, true);

            if (!adjacencyList.containsKey(node)) {
                return;
            }

            for (int neighbor : adjacencyList.get(node)) {
                if (!visited2.containsKey(neighbor)) {
                    DFS(neighbor);
                }
            }
        }
    }

}
