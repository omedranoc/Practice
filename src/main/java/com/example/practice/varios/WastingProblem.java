package com.example.practice.varios;

import com.sun.codemodel.internal.JForEach;

import java.util.*;

public class WastingProblem {

    static  int wasting(List<Integer> onHnad, List<Integer> supplier){
           PriorityQueue<Integer> minHeapHand = new PriorityQueue<>();
           PriorityQueue<Integer> minHeapSupplier = new PriorityQueue<>();
           Collections.sort(onHnad);
           for (int val: onHnad){
               minHeapHand.add(val);
           }
           for (int val: supplier){
            minHeapSupplier.add(val);
           }
        System.out.println("here"+ minHeapHand.peek());

           int solution = 0;
           for(int day =0; day < onHnad.size(); day++){
               int counter =0;
               while(counter <2&&!minHeapHand.isEmpty()&&minHeapHand.peek() == day ){
                   System.out.println("counter h "+counter+" value "+ minHeapHand.peek() +" day "+ day);
                   counter++;
                   if(minHeapHand.poll()== null){
                       break;
                   }
               }
               while(counter <2&&!minHeapSupplier.isEmpty()){
                   if(!minHeapHand.isEmpty()&& counter ==0){
                       System.out.println("counter h "+counter+" value "+ minHeapHand.peek() +" day "+ day);
                       minHeapHand.poll();
                       counter++;
                   }
                   System.out.println("counter s "+counter+" value "+ minHeapSupplier.peek() +" day "+ day);
                   counter ++;
                   solution++;
                   minHeapSupplier.poll();

               }
               while(!minHeapHand.isEmpty()&& day >= minHeapHand.peek()){
                   if(solution >0){
                       solution --;
                   }
                   minHeapHand.poll();
               }
               while(!minHeapSupplier.isEmpty()&& day >= minHeapSupplier.peek()){
                   minHeapSupplier.poll();
               }
           }


        return  solution;
    }

    public static void main(String[] args) {
//
        System.out.println( wasting(Arrays.asList(0, 2, 2), Arrays.asList(2,0,0))); //2
        System.out.println( wasting(Arrays.asList(0,0,2, 4), Arrays.asList(2,0,0))); //1
        System.out.println( wasting(Arrays.asList(0,0,2, 2), Arrays.asList(2,0,0))); //1
        System.out.println( wasting(Arrays.asList(0,0,2, 2,2,2), Arrays.asList(2,0,0))); //0
        System.out.println( wasting(Arrays.asList(0,0,2, 2,2,2), Arrays.asList(2,0,0,3,3))); //2
        System.out.println(  wasting(Arrays.asList(1, 0, 1), Arrays.asList(2,0,2,0,0,2))); //3
       //3
    }
}
