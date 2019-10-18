package com.example.practice

import com.example.practice.domain.AdjacencyMatrixGraph
import spock.lang.Specification
import com.example.practice.domain.Graph.GraphType
/*
similar to the the BFStree but we need a boolean array to represent what vertex have been visited
*/
class BFSGraphTest extends Specification {
    BFSGraph bfsGraph = new BFSGraph()

    def "print root level"(){
        given:
        AdjacencyMatrixGraph adjacencyMatrixGraph = new AdjacencyMatrixGraph(4, GraphType.UNDIRECTED);
        adjacencyMatrixGraph.addEdge(3,2);
        adjacencyMatrixGraph.addEdge(1,3);
        adjacencyMatrixGraph.addEdge(0,2);
        adjacencyMatrixGraph.addEdge(0,1);

        when:
        bfsGraph.applyNormalBFS(adjacencyMatrixGraph, new boolean[4], 0)

        then:
        1 == 1
    }


}
