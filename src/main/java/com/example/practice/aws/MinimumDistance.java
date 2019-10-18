package com.example.practice.aws;

import java.util.LinkedList;
import java.util.List;

public class MinimumDistance
{


    public int minimumDistance(int numRows, int numColumns, List<List<Integer>> area){

        boolean[][] visited = new boolean[area.size()][area.get(0).size()];
        int[] firstCell = new int[]{0, 0, 0};
        LinkedList<int[]> queue = new LinkedList();
        queue.add(firstCell);
        while (queue.isEmpty()){
            int[] cell = queue.poll();
            if(visited[cell[0]][cell[1]]) continue;
            int x = cell[0];
            int y = cell[1];
            int distance = cell[2];
            for(int i = x-1; i <= x +1; i++) {
                for(int j = y-1; j < y+1; j++) {
                    if(i<area.size()&& j< area.get(0).size() && area.get(i).get(j).equals(1)){
                        if(area.get(i).get(j).equals(9))
                            return distance +1;
                        queue.add(new int[]{i, j, distance+ 1});
                    }
                }

            }
        }
        return 0;
    }


    // METHOD SIGNATURE ENDS
}