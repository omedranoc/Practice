package com.example.practice.leetcode

import spock.lang.Specification

class MaximumSubArrayTest extends Specification {
    def "saul"(){
    given:
    MaximumSubArray maximumSubArray = new MaximumSubArray();

    when:
    int output = maximumSubArray.maxSubArray([-2,1,-3,4,-1,2,1,-5,4] as int[])
    then:
    output == 6
    }

}
