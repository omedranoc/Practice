package com.example.practice.aws;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr1
     *  2. INTEGER_ARRAY arr2
     */

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int totalCount = 0;
        for (int i = 0; i< arr1.size(); i++){
            Integer value1 = arr1.get(i);
            Integer value2 = arr2.get(i);
            char[] digits1 =  value1.toString().toCharArray();
            char[] digits2 =  value2.toString().toCharArray();
            for (int j = 0; i < digits1.length; j++){
                System.out.println("out "+j+" "+ digits1[j]+ "total" + totalCount);
                int digitValue1 = Character.getNumericValue(digits1[j]);
                int digitValue2 = Character.getNumericValue(digits2[j]);
                if( digitValue1 > digitValue2 )
                {
                    totalCount += (digitValue1 - digitValue2);
                }else{
                    totalCount += (digitValue2 - digitValue1);
                }

            }

        }

        return totalCount;

    }

}

