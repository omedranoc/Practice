package com.example.practice.aws;

import java.util.*;
import java.util.stream.Collectors;

public class HigestCommonFactors {

    public int generalizedGCD(int num, int[] arr)
    {
        List <Integer> sortArray = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        int gdc = 1;
        for (int i =0; i < sortArray.size() -1 ; i++ ){
            for(int j = i+1; j <= sortArray.size() -1 ; j++ ){
                if(sortArray.get(j)%sortArray.get(i) == 0 ){
                    gdc = sortArray.get(i);
                    if(j == sortArray.size() -1){
                        return  gdc;
                    }
                }else{
                    gdc =1;
                    break;

                }
            }

        }
        return gdc;
        // WRITE YOUR CODE HERE
    }

//    public int generalizedGCD(int num, int[] arr)
//    {
//        List <Integer> sortArray = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
//
//        int gdc = 1;
//        for (int i =0; i < sortArray.size() -1 ; i++ ){
//            if(sortArray.get(i)%sortArray.get(i+1) != 0){
//                gdc = sortArray.get(i+1);
//            }else{
//                gdc =1;
//            }
//        }
//
//        // WRITE YOUR CODE HERE
//    }
//
//    public Integer getGCD(int size, int[] array){
//
//
//        List <Integer> sortArray = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        int gcd = 1;
//        for(int i = 0; i < array.size() ; i++) {
//            for(int j = i + 1; j < array.size(); j++) {
//                if(sortArray.get(j)%sortArray.get(i) == 0){
//                    gcd = sortArray.get(i);
//                }else {
//                    break;
//                }
//            }
//
//        }
//        return gcd;
//
//    }

}
