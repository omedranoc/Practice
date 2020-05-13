package com.example.practice.leetcode

import spock.lang.Specification

class LongestSubStreamTest extends Specification {
    LongestSubStream longestSubStream = new LongestSubStream()
    def "test"(){
    given:
    "abcabcbb"
    when:
    int solution = longestSubStream.lengthOfLongestSubstring("dvdf")
    then:
    solution == 3
    }
}
