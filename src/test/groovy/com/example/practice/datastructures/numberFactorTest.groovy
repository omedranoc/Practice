package com.example.practice.datastructures

import spock.lang.Specification

class numberFactorTest extends Specification {
    def "Calculate"() {
        given:
        def number = new numberFactor()

        when:
        int solutionM = number.calculate(11)
        int solutiony = number.waysToGetN(11)

        then:
        solutionM   == solutiony




    }
}
