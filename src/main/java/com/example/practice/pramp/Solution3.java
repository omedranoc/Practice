package com.example.practice.pramp;

import java.io.*;
import java.util.*;

class Solution3 {

//    static int decodeVariations(String S) {
//        int variations = 0;
//        int minusVal = 0;
//        for (int i =0; i < S.length(); i++){
//            if(S.charAt(i) - '0' == 0){
//                minusVal ++;
//            }else if(i == S.length() -1){
//                variations ++;
//            }else( i < S.length()-2&& new Integer(S.substring(i, i+2)))
//        }
//
//        return variations + recursiveTwoCharacters(S, 0 );
//
//    }
//
//    static int recursiveTwoCharacters(String S, int start, int end, int solution){
//        System.out.println(S +"START ");
//        if(S.length() == 2 && new Integer(S)>26){
//            return 0;
//        }
//        if(S.length() == 2 && new Integer(S) < 27 && new Integer(S) >0){
//            return 1;
//        }
//        solution += recursiveTwoCharacters(S.substring(start, S.length()), solution);
//        solution += recursiveTwoCharacters(S.substring(S.length()-4, S.length()-2), solution);
//        return solution;
//    }

    //public static void main(String[] args) { System.out.println(decodeVariations("1262"));
    //}
}
