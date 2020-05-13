package com.example.practice.string

import spock.lang.Specification

class LexicographicallyTest extends Specification {
    def "GetMinimum"() {
        given:
        Lexicographically lexicographically = new Lexicographically()
        when:
        String s = lexicographically.getMinimum("abczd")
        then:
        s == "abcd"
    }
    def "GetMinimum2"() {
        given:
        Lexicographically lexicographically = new Lexicographically()
        when:
        String s = lexicographically.getMinimum("abcde")
        then:
        s == "abcd"
    }
}
