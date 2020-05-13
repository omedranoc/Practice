package com.example.practice.hackerRank

import com.example.practice.string.MaximumValue
import spock.lang.Specification

class MaximumValueTest extends Specification {
    def "MaximumPossibleValue"() {
        when:
        int solution = MaximumValue.MaximumPossibleValue(268)
        then:
        solution == 5268
    }
    def "MaximumPossibleValue3"() {
        when:
        int solution = MaximumValue.MaximumPossibleValue(668)
        then:
        solution == 6685
    }
    def "MaximumPossibleValue4"() {
        when:
        int solution = MaximumValue.MaximumPossibleValue(664)
        then:
        solution == 6654
    }
    def "MaximumPossibleValue2"() {
        when:
        int solution = MaximumValue.MaximumPossibleValue(-999)
        then:
        solution == -5999
    }
}
