package com.example.practice;

import com.example.practice.domain.AdjacencyMatrixGraph;

import java.util.LinkedList;
import java.util.List;

public class BFSGraph {

    public void applyNormalBFS(AdjacencyMatrixGraph graph, boolean[] visited, int currentVertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if(visited[vertex]) continue;
            System.out.println(vertex + "->");
            visited[vertex] = true;
            List<Integer> adjacencyVertex = graph.getAdjacencyVertices(vertex);
            adjacencyVertex.stream()
                    .filter(v -> visited[v] == false)
                    .forEachOrdered(v -> queue.add(v));

        }

    }

}
