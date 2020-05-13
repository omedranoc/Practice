package com.example.practice.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class largestInteger {
    public  static int largestInteger(int[] input){
        // way to sort and to find the opposite
        // i[0] = 3  || loop to see if I can find 0 for each item
        // can put the abs in a Map and if has the already the value and the flag is  negative
        // 3 true, 2 true, 2 false ...
        //loop if containsKey() and flags are oposite then add it to the max
        Map<Integer, Boolean> numbers = new HashMap();
        int maxVal = Integer.MIN_VALUE;
        for(int v: input){
            boolean flag = v >= 0? true:false;
            if(numbers.containsKey(Math.abs(v))){
                boolean flagNumber =numbers.get(Math.abs(v));
                if(flagNumber^flag ){
                    maxVal = Math.max(maxVal, Math.abs(v));
                }
            }
            else{
                numbers.put(Math.abs(v), flag);
            }

        }

        return maxVal == Integer.MIN_VALUE ? 0: maxVal;
    }
    public static void main(String[] args) {
        System.out.println(largestInteger(new int[]{3, 2, -2, 5, -3}));
        System.out.println(largestInteger(new int[]{3, 2, 2, 5, 3}));
    }

}
