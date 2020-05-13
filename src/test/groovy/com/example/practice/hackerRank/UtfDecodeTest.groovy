package com.example.practice.hackerRank

import spock.lang.Specification

class UtfDecodeTest extends Specification {
    def "ValidUtf8"() {
        when:
        boolean  solution = UtfDecode.validUtf8([197, 130, 1] as int[])
        then:
        solution == true
    }

    def "ValidUtf82"() {
        when:
        boolean  solution = UtfDecode.validUtf8([235, 140, 4] as int[])
        then:
        solution == false
    }

    def "ValidUtf83"() {
        when:
        boolean  solution = UtfDecode.validUtf8([240,162,138,147,145]as int[])
        then:
        solution == false
    }
    def "ValidUtf84"() {
        when:
        boolean  solution = UtfDecode.validUtf8([248,130,130,130]as int[])
        then:
        solution == false
    }


}
