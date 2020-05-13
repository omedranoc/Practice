package com.example.practice.hackerRank

import spock.lang.Specification

class NoConsecutiveStringsTest extends Specification {


    def "NoConsecutiveStrings"() {
        when:
        int solution = NoConsecutiveStrings.noConsecutiveStrings("baaaaa")
        then:
        solution == 1

    }
    def "NoConsecutiveStrings1"() {
        when:
        int solution = NoConsecutiveStrings.noConsecutiveStrings("baaaaaa")
        then:
        solution == 2

    }
    def "NoConsecutiveStrings2"() {
        when:
        int solution = NoConsecutiveStrings.noConsecutiveStrings("bbbbaaaaaa")
        then:
        solution == 3

    }

    def "NoConsecutiveStrings3"() {
        when:
        int solution = NoConsecutiveStrings.noConsecutiveStrings("baaabbaabbba")

        then:
        solution == 2

    }

    def "NoConsecutiveStrings4"() {
        when:
        int solution = NoConsecutiveStrings.noConsecutiveStrings("baabab")

        then:
        solution == 0

    }





}
