package com.example.practice.domain;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class AdjacencyMatrixGraph implements Graph {
    //it is good when the graph have lots of connections
    int[][] adjanceMatrix;
    int numVertices;
    private GraphType graphType = GraphType.UNDIRECTED;

    public AdjacencyMatrixGraph(int numVertices, GraphType graphType) {
        this.numVertices = numVertices;
        this.graphType = graphType;
        adjanceMatrix = new int[numVertices][numVertices];
        for(int i = 0; i < numVertices; i++)
            for(int j = 0; j < numVertices; j++) {
                adjanceMatrix[i][j] = 0;
            }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1 < 0 || v1 >= numVertices || v2 < 0 || v2 >= numVertices)
            throw new IllegalArgumentException("range values are not valid");
        adjanceMatrix[v1][v2] = 1;
        if(graphType == GraphType.UNDIRECTED) adjanceMatrix[v2][v1] = 1;

    }

    @Override
    public List<Integer> getAdjacencyVertices(int v) {
        if(v < 0 || v >= numVertices) throw new IllegalArgumentException("vertex is not valid");
        return IntStream.range(0, numVertices)
                .filter(i -> adjanceMatrix[v][i] == 1)
                .boxed()
                .collect(Collectors.toList());
    }
}
