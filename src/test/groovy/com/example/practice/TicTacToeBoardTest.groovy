package com.example.practice

import spock.lang.Specification

class TicTacToeBoardTest extends Specification {
    TicTacToeBoard ticTacToeBoard = new TicTacToeBoard()

    def "add token to the board"(){
        when:

        ticTacToeBoard.printBoard(1,2,'0')

        then:
        1==1

    }



}
