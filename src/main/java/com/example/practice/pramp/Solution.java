package com.example.practice.pramp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {



        static int numOfPathsToDest(int n) {
            // your code goes here
            // it cannot cross the diagonal border.
            // bre
            //[]
            int[][] matrix = new int[n][n];
            int pointer = n-1;
            int j =0;
            for(int i = 0; i < n; i ++){
                         j = i;

                       while(j <= pointer) {
                           matrix[i][j] = 1 ;
                           j++;
                       }


            }
            System.out.println(matrix);
            return path(matrix, 0, 0, n);
        }

        static int path( int[][] matrix, int i, int j,int n){
            int[] dp = new int[n];
            if(i<0 || i >= matrix.length || j >= matrix.length ||  matrix[i][j] ==0 || j <0 ){
                return 0;
            }else if( i == n -1  && j == n -1){
                return 1;
            }
            if(dp[n-1] == 0){
                int left = path(matrix, i +1, j, n);
                int right= path(matrix, i, j +1, n);
                dp[n-1] = left + right;
            }
            return dp[n-1];
        }

        public static void main(String[] args) {
            System.out.println(numOfPathsToDest(4));
        }




}