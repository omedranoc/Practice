package com.example.practice.aws;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Struct;
import java.util.*;

public class AwsTruck {
    @Data
    @AllArgsConstructor
    class Cell{
        int x;
        int y;
        int value;
        int distance;
    }

    public int minimumDistance(int numRows, int numColumns, List<List<Integer>> area){
        boolean[][] visited = new boolean[numRows][numColumns];

        LinkedList<Cell> queue = new LinkedList<>();

       // List<String> primeList =  orderList.stream().filter(p -> p.split()[1].matches([]))
        //queue.stream()
        queue.add(new Cell(0,0, 1, 0));
        int result =0;
        while (!queue.isEmpty()) {
            Cell vertex = queue.poll();
            if(visited[vertex.x][vertex.y]==true) continue;

            System.out.println(vertex + "->");
            visited[vertex.x][vertex.y]= true;
            int rowNum[] = {-1, 0, 0, 1};
            int colNum[] = {0, -1, 1, 0};

            for (int i = 0; i < 4; i++)
            {
                int row = vertex.x + rowNum[i];
                int col = vertex.y + colNum[i];
                if(vertex.x >= 0 && vertex.x < numRows && vertex.y >= 0 && vertex.y < numColumns)
                    if(row >= 0 && row < numRows && col >= 0 && col < numColumns ){
                        if (area.get(row).get(col)==1 || area.get(row).get(col)==9) {
                            Cell cell = new Cell(row, col, 1, vertex.getDistance() +1);
                            if(area.get(row).get(col) == 9){
                                return cell.getDistance();
                            }
                            queue.add(cell);

                        }
                    }

            }


        }
       return result;

    }






}
