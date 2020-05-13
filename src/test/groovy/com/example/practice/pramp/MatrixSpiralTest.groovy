package com.example.practice.pramp

import spock.lang.Specification

class MatrixSpiralTest extends Specification {
    def "SpiralCopy"() {
     given:
     int[][] spiral = [[1,    2,   3,  4,    5],
         [6,    7,   8,  9,   10],
         [11,  12,  13,  14,  15],
         [16,  17,  18,  19,  20] ];
     when:
     def solution = MatrixSpiral.spiralCopy(spiral)
     then:
     solution == [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
    }
}
