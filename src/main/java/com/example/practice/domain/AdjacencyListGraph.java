package com.example.practice.domain;

import lombok.Data;

import java.util.List;

@Data
public class AdjacencyListGraph {
    // no really good to represent a graph. it is hard to delete a node
    //using a adjacency set is a better solution, nice to sparce graph, it is efficient
    //                      adjacency Matrix  adjacencyList AdjacencySet
    //space                     v^2           E + V         E+V
    // is edge present          1           degree of v   lg(degree of v)
    // iterate over edges       V           degree of v   degree of v



    List<GraphNode> vertices;
}
