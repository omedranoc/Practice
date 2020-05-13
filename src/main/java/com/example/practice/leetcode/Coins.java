package com.example.practice.leetcode;

public class Coins {

    public int coinChange(int[] coins, int amount) {
        int[] solution = new int[amount + 1];
        for(int i = 0 ; i < solution.length; i ++){
            solution[i] = -1;
        }

        solution[0] = 0;

        for(int i = 2; i <= amount; i++){
            int minimumWays = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] >= 0 &&  solution[i - coins[j]] != Integer.MAX_VALUE){
                    minimumWays =  Math.min(solution[i - coins[j]]  + 1, minimumWays );
                }
            }
            solution[i] = minimumWays;

        }

        return solution[amount];
    }

}
