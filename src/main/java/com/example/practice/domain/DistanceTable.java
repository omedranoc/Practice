package com.example.practice.domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.stream.IntStream;

public class DistanceTable {

    public static   Map<Integer, DistanceToVertex> buildDistanceTable(AdjacencyMatrixGraph graph, int source){
        Map<Integer, DistanceToVertex> distaceTable = new HashMap<>();
        IntStream.range(0, graph.getNumVertices()).forEach(vertex -> distaceTable.put(vertex, new DistanceToVertex()));
         //add the source to the table
        distaceTable.get(source).setDistance(0);
        distaceTable.get(source).setLastVertex(source);
        // create a queue and add the values to the queue
        LinkedList<Integer> queue = new LinkedList();
        while (!queue.isEmpty()){
            int currentVertex = queue.poll();
            graph.getAdjacencyVertices(currentVertex).forEach(
                    vertex ->{
                        int currentDistance =distaceTable.get(vertex).getDistance();
                        if(currentDistance == -1){
                            currentDistance =distaceTable.get(currentVertex).getDistance();
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

    public void shortestPath(AdjacencyMatrixGraph graph, int source, int destination){
        Map<Integer, DistanceToVertex> distanceTable = buildDistanceTable(graph, source);
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
            System.out.println("the smallest path is: " +source);
            while(!stack.isEmpty()){
                System.out.println("->" + stack.pop());
            }
        }


    }


}
