package com.example.practice.datastructures;

public class numberFactor {

    public  int calculate(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        int sum1 = calculate(n - 1);
        int sum2 = calculate(n - 3);
        int sum3 = calculate(n - 4);
        return sum1 + sum2 + sum3;
    }



    public int waysToGetN(int n) {
        if ((n == 0) || (n == 1) || (n == 2)) // { }, {1}, {1,1}
            return 1; //
        if (n == 3)
            return 2; // {1,1,1}, {3}

        int subtract1 = waysToGetN(n - 1); // if we subtract 1, we will be left with 'n-1'
        int subtract3 = waysToGetN(n - 3); // if we subtract 3, we will be left with 'n-3'
        int subtract4 = waysToGetN(n - 4); // if we subtract 4, we will be left with 'n-4'

        return subtract1 + subtract3 + subtract4;
    }//End of method





}

