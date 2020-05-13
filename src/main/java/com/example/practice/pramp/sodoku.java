package com.example.practice.pramp;

import java.util.HashSet;
import java.util.Set;

public class sodoku {

    static boolean sudokuSolve(char[][] board) {
        Set<String> seen =  new HashSet();


        for(int row = 0; row< 8; row ++){
            for(int column = 0; column< 0; column++){
                if(board[row][column] != '.')
                    System.out.println(board[row][column] + "in row" + row);
                if(!seen.add(board[row][column] + "in row" + row)
                        || !seen.add(board[row][column] + "in col" + row) ||
                        !seen.add(board[row][column] + "in subbox" + row/3 + "-" + column/3))
                    return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }

}
