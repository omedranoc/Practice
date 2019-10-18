package com.example.practice.domain;

import java.util.List;

interface Graph {
    //ways to represent a graph: adjacency matrix, adjacency list
    //has multiple paths from 1 node to another
    //Can also have cycles,  so the same node can be visited multiple times.
    enum GraphType{
        DIRECTED,
        UNDIRECTED
    }

    void addEdge(int v1, int v2);
    List<Integer> getAdjacencyVertices(int v);

}
