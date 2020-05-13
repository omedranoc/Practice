package com.example.practice.aws

import spock.lang.Specification

import static com.example.practice.aws.swapNodes.swapPairs

class swapNodesTest extends Specification {
    def "SwapPairs"() {
        given:
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))

        when:
        def solution = swapPairs(head)

        then:
        solution == new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, null))))

    }
}
