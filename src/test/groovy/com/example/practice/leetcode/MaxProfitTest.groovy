package com.example.practice.leetcode

import spock.lang.Specification

class MaxProfitTest extends Specification {
    def "test"(){
    given:
    int[] input =[1,2]
    def profit = new MaxProfit();
    when:
    def output = profit.maxProfit(input)

    then:
    output == 1
    }

    def "test1"(){
        given:
        int[] input =[7,1,5,3,6,4]
        def profit = new MaxProfit();
        when:
        def output = profit.maxProfit(input)

        then:
        output == 5
    }

    def "test2"(){
        given:
        int[] input =[1,4,1,4,3,1]
        def profit = new MaxProfit();
        when:
        def output = profit.maxProfit(input)

        then:
        output == 3
    }

}
