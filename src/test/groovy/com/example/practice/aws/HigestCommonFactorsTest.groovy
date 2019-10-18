package com.example.practice.aws

import spock.lang.Specification

class HigestCommonFactorsTest extends Specification {
    HigestCommonFactors higestCommonFactors = new HigestCommonFactors()
    def "test"(){
    given:
    def num = 5
    int[]  arr = [2, 4, 6, 8, 10]
    when:
    Integer solution = higestCommonFactors.generalizedGCD(num, arr)
    then:
    solution == 2

     }
}
