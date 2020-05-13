package com.example.practice.leetcode;

import java.util.*;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for (int i = 0 ; i < prices.length ; i++){
            if (i > 0){
                profit = Math.max(prices[i] - min, profit);
            }
            min = Math.min(prices[i], min);
        }
        return profit > 0 ? profit : 0;
    }

}
