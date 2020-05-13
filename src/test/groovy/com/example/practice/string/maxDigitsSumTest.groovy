package com.example.practice.string

import spock.lang.Specification

class maxDigitsSumTest extends Specification {
    def "MaxNumber"() {
        given:
        def max = new maxDigitsSum();
        when:
        int maxNumber =max.maxNumber([51, 71, 17, 42] as int[])
        then:
        maxNumber == 93
    }
    def "MaxNumber1"() {
        given:
        def max = new maxDigitsSum();
        when:
        int maxNumber =max.maxNumber([51, 71, 17, 42, 80] as int[])
        then:
        maxNumber == 173
    }
}
