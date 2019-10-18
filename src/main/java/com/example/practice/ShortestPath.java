package com.example.practice;

import com.example.practice.domain.AdjacencyMatrixGraph;
import com.example.practice.domain.DistanceToVertex;

import java.util.*;
import java.util.stream.IntStream;

public class ShortestPath {

    public static Map<Integer, DistanceToVertex> buildDistanceTable(AdjacencyMatrixGraph graph, int source){
        Map<Integer, DistanceToVertex> distaceTable = new HashMap<>();
        IntStream.range(0, graph.getNumVertices()).forEach(vertex -> distaceTable.put(vertex, new DistanceToVertex()));
        //add the source to the table
        distaceTable.get(source).setDistance(0);
        distaceTable.get(source).setLastVertex(source);
        // create a queue and add the values to the queue
        LinkedList<Integer> queue = new LinkedList();
        queue.add(source);
        while (!queue.isEmpty()){
            int currentVertex = queue.poll();
            graph.getAdjacencyVertices(currentVertex).forEach(
                    vertex ->{
                        int currentDistance =  distaceTable.get(vertex).getDistance();
                        if(currentDistance == -1){
                            currentDistance = 1 + distaceTable.get(currentVertex).getDistance();
                            distaceTable.get(vertex).setDistance(currentDistance);
                            distaceTable.get(vertex).setLastVertex(currentVertex);
                            if(!graph.getAdjacencyVertices(1).isEmpty()){
                                queue.add(vertex);
                            }
                        }
                    }
            );
        }

        return  distaceTable;
    }

    public List<Integer> shortestPath(AdjacencyMatrixGraph graph, int source, int destination){
        Map<Integer, DistanceToVertex> distanceTable = buildDistanceTable(graph, source);
        List<Integer> solution = new ArrayList<>();
        //push the destination to the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(destination);
        int previousVertex = distanceTable.get(destination).getLastVertex();
        while (previousVertex != -1 && previousVertex != source){
            stack.push(previousVertex);
            previousVertex = distanceTable.get(previousVertex).getLastVertex();
        }
        if(previousVertex ==-1){
            System.out.println("there is not path destination"+ source +" "+ destination);
        }else{
            solution.add(source);
            System.out.println("the smallest path is: " +source);
            while(!stack.isEmpty()){
                solution.add(stack.pop());
                System.out.println("->" + solution);
            }
        }
        return  solution;

    }




}
