package com.example.practice.leetcode

import spock.lang.Specification

class CommonDivisorTest extends Specification {
    def "test"(){
    given:
    CommonDivisor commonDivisor = new  CommonDivisor()

    when:
    commonDivisor.apply(5, 10);

    then:
    1==1
    }
}
