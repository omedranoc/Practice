package com.example.practice.pramp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

//Merging 2 Packages
//    Merging 2 Packages
//    Given a package with a weight limit limit and an array arr of item weights, implement a function getIndicesOfItemWeights that finds two items whose sum of weights equals the weight limit limit. Your function should return a pair [i, j] of the indices of the item weights, ordered such that i > j. If such a pair doesn’t exist, return an empty array.
//
//    Analyze the time and space complexities of your solution.
//
//            Example:
//
//    input:  arr = [4, 6, 10, 15, 16],  lim = 21
//
//    output: [3, 1] # since these are the indices of the
//               # weights 6 and 15 whose sum equals to 21
//    Constraints:
//
//            [time limit] 5000ms
//
//[input] array.integer arr
//
//0 ≤ arr.length ≤ 100
//            [input] integer limit
//
//[output] array.integer

    static int[] getIndicesOfItemWeights(int[] arr, int limit) {
        Map<Integer, Integer> mapOfIndices = new HashMap();

        for (int i = 0; i <arr.length; i++){
            int w = arr[i];
            Integer complementIndex = mapOfIndices.get(limit - w);
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }
            mapOfIndices.put(arr[i], i);


        }

        return new int[0];

    }

    public static void main(String[] args) {
        System.out.println(getIndicesOfItemWeights(new int[]{4, 6, 10, 15, 16}, 21)[0]);
        System.out.println(getIndicesOfItemWeights(new int[]{4, 6, 10, 15, 16}, 21)[1]);
    }


}