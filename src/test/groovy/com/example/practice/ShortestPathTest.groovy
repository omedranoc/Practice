package com.example.practice

import com.example.practice.domain.AdjacencyMatrixGraph
import spock.lang.Specification

class ShortestPathTest extends Specification {
    //build the distance table  vertex | distance | last vertex
    //calculate their distances
    //take the destination vertex and added to a stack and to go back to the source to  see the shortest path
    //runnning time using a adjance list is 0(V+E)
    //runnning time using a adjance matrix is o(v^2)
      ShortestPath shortestPath = new ShortestPath();
    def "apply the post-order depth first search algorithm"(){
        given:
        AdjacencyMatrixGraph adjacencyMatrixGraph = new AdjacencyMatrixGraph(4, com.example.practice.domain.Graph.GraphType.UNDIRECTED);
        adjacencyMatrixGraph.addEdge(3,2);
        adjacencyMatrixGraph.addEdge(1,3);
        adjacencyMatrixGraph.addEdge(0,2);
        adjacencyMatrixGraph.addEdge(0,1);

        when:
        List<Integer> solution = shortestPath.shortestPath(adjacencyMatrixGraph, 3, 1)

        then:
        solution == [3, 1]
    }


}
