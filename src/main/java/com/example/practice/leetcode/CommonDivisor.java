package com.example.practice.leetcode;

public class CommonDivisor {

    public Integer apply(int x, int y){
        int min = Math.max(x, y);
        int max = Math.min(x, y);

        if(max%min == 0){
            return min;
        }
      return 0;

    }
}
