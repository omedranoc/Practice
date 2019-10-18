package com.example.practice;

import com.example.practice.domain.AdjacencyMatrixGraph;

import java.util.List;

public class DFSGraph {

    public void postOrder(AdjacencyMatrixGraph graph, boolean[] visited, int currentVertex ){
        if(visited[currentVertex] == true) return;
        visited[currentVertex] = true;
        List<Integer> adjacencyVertices = graph.getAdjacencyVertices(currentVertex);
        adjacencyVertices.stream().forEachOrdered(vertex -> postOrder(graph, visited, vertex));
        System.out.println("current vertex "+ currentVertex +"->");
    }

}
