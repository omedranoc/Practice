package com.example.practice.hackerRank

import spock.lang.Specification

class SherlockTest extends Specification {

    def "test"(){
    when:
    String solution = Sherlock.isValid("abcdefghhgfedecba")
    then:
    solution == "YES"
    }
    def "test2"(){
        when:
        String solution = Sherlock.isValid("aabbccddeefghi")
        then:
        solution == "NO"
    }
    def "test3"(){
        given:
        def longString = new File('longString').text
        when:
        String solution = Sherlock.isValid(longString)
        then:
        solution == "YES"
    }

    def "test4"(){
        given:
        def longString = new File('test2').text
        when:
        String solution = Sherlock.isValid(longString)
        then:
        solution == "YES"
    }


    def "test5"(){
        when:
        String solution = Sherlock.isValid("aaaabbcc")
        then:
        solution == "NO"
    }

    def "test6"(){
        when:
        String solution = Sherlock.isValid("aaaaabc")
        then:
        solution == "NO"
    }




}
