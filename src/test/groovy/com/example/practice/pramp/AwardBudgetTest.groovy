package com.example.practice.pramp

import spock.lang.Specification

class AwardBudgetTest extends Specification {
    def "test"() {
        when:
        println 47 * 4 +2
        double result = AwardBudget.findGrantsCap([2, 100, 50, 120, 1000] as double[], 190)
        then:
        result*4 + 2 == 190
        println 45.2 * 4
    }

    def "test x"() {
        when:
        println 47 * 4 +2
        double result = AwardBudget.findGrantsCap([1, 7] as double[], 6)
        then:
        result== 5
        println 45.2 * 4
    }

    def "test2"() {
        when:
        println 47 * 4 +2
        double result = AwardBudget.findGrantsCap([1,2,3] as double[], 3)
        then:
        result*4 + 2 == 190
        println 45.2 * 4
    }

    def "test 2"() {
        when:
        println 128 * 1 +272
        double result = AwardBudget.findGrantsCap([2,100,50,120,167] as double[], 400)
        then:
        result == 128

    }
    def "test 3"() {
        when:
        println 128 * 1 +272
        double result = AwardBudget.findGrantsCap([2,4] as double[], 3)
        then:
        result == 1.5

    }


}
