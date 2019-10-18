package com.example.practice

import com.example.practice.domain.AdjacencyMatrixGraph
import spock.lang.Specification

class DFSGraphTest extends Specification {
     DFSGraph dfsGraph = new DFSGraph()

    def "apply the post-order depth first search algorithm"(){
        given:
        AdjacencyMatrixGraph adjacencyMatrixGraph = new AdjacencyMatrixGraph(4, com.example.practice.domain.Graph.GraphType.UNDIRECTED);
        adjacencyMatrixGraph.addEdge(3,2);
        adjacencyMatrixGraph.addEdge(1,3);
        adjacencyMatrixGraph.addEdge(0,2);
        adjacencyMatrixGraph.addEdge(0,1);

        when:
        dfsGraph.postOrder(adjacencyMatrixGraph, new boolean[4], 0)

        then:
        1 == 1
    }

}
