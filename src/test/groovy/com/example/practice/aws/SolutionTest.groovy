package com.example.practice.aws

import com.example.practice.pramp.Solution
import spock.lang.Specification

class SolutionTest extends Specification {
    Solution solution = new Solution();
    def "TwoSum"() {
        when:
        def solution = solution.twoSum([3,3] as int[], 6)
        then:
        solution == [0, 1]
    }
}
