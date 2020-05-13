package com.example.practice.hackerRank

import spock.lang.Specification

class SpecialStringTest extends Specification {

    def "SubstrCount"() {
        given:
        String input ="asasd"
        int length =input.length()

        when:
        long solution = SpecialString.substrCount(length, input)

        then:
        solution == 7

    }

    def "SubstrCount3"() {
        given:
        String input ="aaaa"
        int length =input.length()

        when:
        long solution = SpecialString.substrCount(length, input)

        then:
        solution == 10

    }
    def "SubstrCount4"() {
        given:
        String input ="aaaa"
        int length =input.length()
        def specialString = new File('specialString').text

        when:
        long solution = SpecialString.substrCount(length, specialString)

        then:
        solution == 1272919l

    }






/*  0 1 a     1
    0 2 ab
    0 3 abc
    0 4 abcb
    0 5 abcba
    0 6 abcbab
    1 2 b2
    1 3 bc
    1 4 bcb3
    1 5 bcba
    1 6 bcbab
    2 3 c4
    2 4 cb
    2 5 cba
    2 6 cbab
    3 4 b5
    3 5 ba
    3 6 bab6
    4 5 a7
    4 6 ab
    5 6 b*/

    def "SubstrCount1"() {
        given:
        String input ="abcbaba"
        int length =input.length()

        when:
        long solution = SpecialString.substrCount(length, input)

        then:
        solution == 10

    }

}
