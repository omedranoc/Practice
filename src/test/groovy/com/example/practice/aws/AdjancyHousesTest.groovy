package com.example.practice.aws

import spock.lang.Specification

class AdjancyHousesTest extends Specification {

    def "test 1"(){
    given:
    def cellsStates = [0,1,0,0,1,0,0,0] as List<Boolean>
    Integer days = 1
    AdjancyHouses adjancyHouses = new AdjancyHouses()
    when:
    List solution = adjancyHouses.compete(cellsStates, days)
    then:
    solution == [0,1,0,0,1,0,1,1]
    }


    def "test 2"(){
        given:
        def cellsStates = [0,1,0,0,1,0,0,0] as List<Boolean>
        Integer days = 2
        AdjancyHouses adjancyHouses = new AdjancyHouses()
        when:
        List solution = adjancyHouses.compete(cellsStates, days)
        then:
        solution ==  [0,1,0,0,1,1,0,0]

    }
}
