package com.example.practice.hackerRank

import spock.lang.Specification

class LongestSubStringTest extends Specification {
    def "LengthOfLongestSubstring"() {
        when:
        int solution = LongestSubString.lengthOfLongestSubstring("abcabcbb")

        then:
        solution == 3
    }
}
