package Graph.l1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {

    public static void main(String[] args) {
        Graph g = new Graph();
    /*  // undirected unweighted graph

        g.addEdge(0, 1, false);
        g.addEdge(1, 2, false);
        g.addEdge(0,2, false);
    */
    /*  // directed unweighted graph
        g.addEdge(0, 1, true);
        g.addEdge(1, 2, true);
        g.addEdge(0,2, true);
        g.printAdjacencyList();
    */
    /*  // directed weighted graph
        g.addEdgeWithWeight(0, 1, 5, true);
        g.addEdgeWithWeight(1, 2, 8, true);
        g.addEdgeWithWeight(0, 2, 6, true);
        g.printWeightedAdjacencyList();
    */

        // directed weighted graph
        g.addEdgeWithWeight(0, 1, 5, false);
        g.addEdgeWithWeight(1, 2, 8, false);
        g.addEdgeWithWeight(0, 2, 6, false);
        g.printWeightedAdjacencyList();


    }
}

class Graph {

    /*---------------------unweighted directed and undirected graph-----------------------------------------*/

    // unweighted directed and undirected graph
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

    /*-------------------------weighted directed and undirected graph-----------------------------------------*/
    Map<Integer, List<List<Integer>>> WeightedAdjacencyList = new HashMap<>();

    void addEdgeWithWeight(int u, int v, int weight, boolean directed) {
        if (!WeightedAdjacencyList.containsKey(u)) {
            WeightedAdjacencyList.put(u, new ArrayList<>());
        }
        List<Integer> edgeWithWeight = new ArrayList<>();
        edgeWithWeight.add(v);
        edgeWithWeight.add(weight);
        WeightedAdjacencyList.get(u).add(edgeWithWeight);

        if (!directed) {
            if (!WeightedAdjacencyList.containsKey(v)) {
                WeightedAdjacencyList.put(v, new ArrayList<>());
            }
            edgeWithWeight = new ArrayList<>();
            edgeWithWeight.add(u);
            edgeWithWeight.add(weight);
            WeightedAdjacencyList.get(v).add(edgeWithWeight);
        }
    }

    void printWeightedAdjacencyList() {
        for (Map.Entry<Integer, List<List<Integer>>> entry : WeightedAdjacencyList.entrySet()) {
            System.out.print("Adjacency list of vertex " + entry.getKey() + " is ");
            for (List<Integer> edgeWithWeight : entry.getValue()) {
                System.out.print("(" + edgeWithWeight.get(0) + ", " + edgeWithWeight.get(1) + ") ");
            }
            System.out.println();
        }
    }
}
