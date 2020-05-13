package com.example.practice.fa;

import java.util.Arrays;

public class array {


    static int recursion(int[] arr, int index,   int max, int[] solution){
        if(index >= arr.length || index < 0 ){
            return 0;
        }
        else if (arr[index] < max){

        }

        int count1 =recursion(arr, index -1,  arr[index -1], solution);
        //int count =recursion(arr, index,  arr[index], solution);
        int count2 =recursion(arr, index  +1,  arr[index],  solution);
        solution[index] = count1 + count2;
        return 1+count1 +count2;

    }



    static int[] countSubarrays(int[] arr) {
        int[] arraysCount = new int[arr.length];
        recursion(arr, 0, arr[0],  arraysCount);
        return arraysCount;

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countSubarrays(new int[]{1, 3})));
    }


}
