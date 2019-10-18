package com.example.practice.aws

import spock.lang.Specification

class AwsTruckTest extends Specification {
    def "test"(){
    given:
   AwsTruck awsTruck = new AwsTruck();
    List<List<Integer>> area =  [
        [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
        [ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 ],
        [ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 ],
        [ 0, 0, 0, 0, 9, 0, 0, 0, 0, 1 ],
        [ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 ],
        [ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 ],
        [ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 ],
        [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
        [ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 ]
    ];
    when:
    int solution =awsTruck.minimumDistance(9, 10, area)
    then:
    solution == 11
    }
}
