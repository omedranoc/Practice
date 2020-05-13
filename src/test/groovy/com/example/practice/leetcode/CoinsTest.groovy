package com.example.practice.leetcode

import spock.lang.Specification

class CoinsTest extends Specification {
    def "test"(){
    given:
    int[] coins = [2]
        int amount = 5
     Coins coins1 = new Coins();
    when:
    int solution = coins1.coinChange(coins, amount)
    then:
    solution == -1

    }

    def "test3"(){
        given:
        int[] coins = [2]
        int amount = 3
        Coins coins1 = new Coins();
        when:
        int solution = coins1.coinChange(coins, amount)
        then:
        solution == -1

    }

    def "test1"(){
        given:
        int[] coins = [1, 2, 5]
        int amount = 11
        Coins coins1 = new Coins();
        when:
        int solution = coins1.coinChange(coins, amount)
        then:
        solution == 3

    }

}
