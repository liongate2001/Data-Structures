/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adjacencylist;

/**
 *
 * @author Janri
 */
import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        // Create a graph with 7 vertices (A, B, C, D, E, F, G)
        int V = 7;
        LinkedList<Integer> adjListArray[] = new LinkedList[V];

        // Each adjacency list
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }

        // Add edges to the graph based on the given graph
        addEdge(adjListArray, 0, 1); // A - B
        addEdge(adjListArray, 0, 3); // A - D
        addEdge(adjListArray, 1, 2); // B - C
        addEdge(adjListArray, 1, 3); // B - D
        addEdge(adjListArray, 2, 3); // C - D
        addEdge(adjListArray, 3, 4); // D - E
        addEdge(adjListArray, 4, 5); // E - F
        addEdge(adjListArray, 4, 6); // E - G

        // Print the adjacency list
        printAdjacencyList(adjListArray);
    }

    // Function to add an edge to the graph
    static void addEdge(LinkedList<Integer> adjListArray[], int src, int dest) {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);
    }

    // Function to print the adjacency list
    static void printAdjacencyList(LinkedList<Integer> adjListArray[]) {
        char vertex = 'A';
        for (int i = 0; i < adjListArray.length; i++) {
            System.out.print("Adjacency list of vertex " + (char)(vertex + i));
            for (Integer v : adjListArray[i]) {
                System.out.print(" -> " + (char)(vertex + v));
            }
            System.out.println();
        }
    }
}