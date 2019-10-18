package com.example.practice.aws

import spock.lang.Specification

class HeightTest extends Specification {
    Height height = new Height()
    def "test"(){
    given:
    when:
    int solution = height.height(new Node(data:2, left: new Node(data:3, left: new Node(data:5)) ))
    then:
    solution == 3
    }
}
