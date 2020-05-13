package com.example.practice.string

import spock.lang.Specification
import sun.security.x509.OtherName

class MakePalindromeTest extends Specification {
    def "Make"() {
        given:
        MakePalindrome makePalindrome = new MakePalindrome()
        when:
        String solution = makePalindrome.make("mamad")
        then:
        solution == 1

    }
}
