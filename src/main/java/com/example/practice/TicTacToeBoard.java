package com.example.practice;

import java.util.Arrays;

public class TicTacToeBoard {
  char[][] board = new char[3][3];


  public void printBoard(int rowPosition, int columnPosition, char token){
      char[][] board = add(rowPosition,columnPosition, token);
      char[][] outputBoard = new char[3][3];

      for (int row = 0; row<board.length; row++) {
          System.out.print('\n');
          for (int column = 0; column < board.length; column++) {
                  if  (board[row][column] == '\u0000'){
                      outputBoard[row][column] = '-';
                  } else {
                      outputBoard[row][column] = board[row][column];
                  }

                  System.out.print(outputBoard[row][column]+"|" );

          }

          System.out.println(add(1, 2, 'O'));

      }
  }
private  char[][] add(int x, int y,char token){
    char[][] board = new char[3][3];
    board[x][y] = token;
    return board;
};


}
