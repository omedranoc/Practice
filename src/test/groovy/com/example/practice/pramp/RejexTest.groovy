package com.example.practice.pramp

import spock.lang.Specification

class RejexTest extends Specification {
    Rejex rejex = new Rejex()
//    input:  text = "aa", pattern = "a"
//    output: false
//
//    input:  text = "aa", pattern = "aa"
//    output: true
//
//    input:  text = "abc", pattern = "a.c"
//    output: true
//
//    input:  text = "abbb", pattern = "ab*"
//    output: true
//
//    input:  text = "acd", pattern = "ab*c."
//    output: true

    def "test"() {
        given:

        String text = "aa"
        String pattern = "a"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == false
    }

    def "test2"() {
        given:
        String text = "aa"
        String pattern = "aa"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == true
    }

    def "test3"() {
        given:
        String text = "abc"
        String pattern = "a.c"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == true
    }

    def "test4"() {
        given:
        String text = "abbb"
        String pattern = "ab*"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == true
    }


    def "test5"() {
        given:
        String text = "acd"
        String pattern = "ab*c."

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == true
    }


    def "test6"() {
        given:
        String text = "abbdbb"
        String pattern = "ab*d"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == false
    }

    def "test7"() {
        given:
        String text =  "abaa"
        String pattern = "a.*a*"

        when:
        boolean output = rejex.isMatch(text, pattern)

        then :
        output == true
    }





}
