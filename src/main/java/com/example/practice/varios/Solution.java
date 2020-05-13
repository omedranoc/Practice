package com.example.practice.varios;

import java.util.HashMap;
import java.util.Map;

import java.io.*;
import java.util.*;

class Solution {

    /*
     arr =  [ 1 2 3 4]
     k = 4
     flip -> [ 4 3 2 1]

    arr =  [ 1 2 3 4]
     k = 3
     flip -> [ 3 2 1 4]


  input:  arr = [1, 5, 4, 3, 2]  max_ind = 1
  k=2 [5, 1, 4, 3, 2] max_ind = 0
  k=5 [2, 3, 4, 1, 5]


  [2, 3, 4, 1, 5]  max = 4 max_ind = 2
  k=(max_ind + 1) = 3  [4, 3, 2, 1, 5]
  k( arr.length-1  - i)

  for  // N
  1. find max, m  // N
  2. is m at arr.length-1 ?
     if no, then flip (with different ks) until m is at end   // 2 flips => 2 *O(N) => O(N)
     if yes, find max in (0, arr.length -1  - i)

    */
    static int[] pancakeSort(int[] arr) {
        for(int i = 0; i < arr.length ; i++ )
        {
            int max_ind = getMaxInd( arr, arr.length - i);
            if( max_ind != (arr.length - i) )
            {
                flip( arr, max_ind + 1);
                flip( arr, arr.length - i);
            }
        }
        return arr;
    }

    static int getMaxInd( int[] arr, int size)
    {
        int max = Integer.MIN_VALUE;
        int max_ind = -1;
        for(int i = 0 ; i < size; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                max_ind = i;
            }
        }
        return max_ind;
    }


    static void flip(int [] arr, int k)
    {
        int start = 0;
        int end = k;
        while( start != end)
        {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 3, 4};
        System.out.println( pancakeSort(arrs));
    }

}