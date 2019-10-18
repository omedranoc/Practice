package com.example.practice.aws

import spock.lang.Specification

class SecondsSongTest extends Specification {

    def "test that the song ends exactly 30 seconds before the ride ends"(){
    given:
    SecondsSong secondsSong = new SecondsSong()
    def rideDuration = 90
    def songDuration =  [1, 10, 25, 35, 60]

    when:
    List solution = secondsSong.idOfSongs(90, songDuration)

    then:
    solution == [2,3]
    }
    def "test that the song ends exactly 3x0 seconds before the ride ends"(){
        given:
        SecondsSong secondsSong = new SecondsSong()
        def rideDuration = 90
        def songDuration =  [1, 10, 25, 35, 11]

        when:
        List solution = secondsSong.idOfSongs(90, songDuration)

        then:
        solution == [2,3]
    }
}
