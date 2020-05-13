package com.example.practice.string;

import java.util.HashSet;
import java.util.Set;

public class Concatenate {
    public static int concatenate(String[] input){
        // function to find duplicates
        //  loop to find the max length
        int maxLength = Integer.MIN_VALUE;
        for(int i =0 ; i < input.length; i ++){
            for(int j = i +1; j < input.length; j++){
                String concat = input[i] + input[j];
                if(isUnique(concat)){
                    maxLength = Math.max(maxLength, concat.length());
                }
            }
        }

        return maxLength == Integer.MIN_VALUE ? 0: maxLength ;
    }

    public static boolean isUnique(String s){
        if("".equals(s)|| s == null){
            return false;
        }
        Set<Character> unique = new HashSet();
        for(Character v : s.toCharArray()){

            if(!unique.add(v)){

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(concatenate(new String[]{"co","dil","ity"}));
        System.out.println(concatenate(new String[]{"abc","kkk","def","csv"}));

    }
}
