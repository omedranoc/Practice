package com.example.practice.pramp;

public class MatrixSpiral {

    static int[] spiralCopy(int[][] inputMatrix) {
        int[] solution = new int[inputMatrix.length * inputMatrix[0].length];
        int count = 0;
        int rowLeft = 0;
        int rowRight = inputMatrix[0].length;
        int columnUp = 0;
        int columnDown = 0;
        while(rowRight>=rowLeft&&columnDown>=columnDown&&count<solution.length) {
            for(int row = rowLeft; row < rowRight; row++) {
                solution[count] = inputMatrix[columnUp][row];
                count++;

            }
            for(int column = columnUp + 1; column < columnDown; column++) {
                System.out.println(column);
                solution[count] = inputMatrix[column][rowRight - 1];
                count++;

            }
            for(int row = rowRight - 1; row > rowLeft; row--) {
                System.out.println(row);
                solution[count] = inputMatrix[columnDown - 1][row - 1];
                count++;


            }
            for(int column = columnDown - 2; column > columnUp; column--) {
                System.out.println(column);
                solution[count] = inputMatrix[column][rowLeft];
                count++;

            }
            rowRight -=1;
            columnUp +=1;
            rowLeft +=1;
            columnDown -=1;
            for(int i = 0; i < solution.length; i++)
                System.out.println(solution[i]);
        }


        return solution;
    }

    public static void main(String[] args) {
        int[][] spiral = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                          {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20}};
        System.out.println(spiralCopy(spiral));
    }

}
