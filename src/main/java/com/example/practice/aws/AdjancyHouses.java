package com.example.practice.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AdjancyHouses {

    public List<Integer> compete(List<Integer> states, int days){
        List<List<Integer>> solution = new ArrayList();
        solution.add(states);
        IntStream.rangeClosed(1, days).forEach( i ->{
            solution.add(getCellsByDay(solution.get(i-1)));
        });

        return solution.get(days);
    }

    private List<Integer> getCellsByDay(List<Integer> states) {
        List<Integer> solutionByDay = new ArrayList<>();
        solutionByDay.add(cellState(0, states.get(1)));
        for(int i = 1; i < states.size() -1 ; i++) {
            solutionByDay.add(cellState(states.get(i-1), states.get(i+1)));
        }
        solutionByDay.add(cellState(states.get(states.size()-1),0));
        return solutionByDay;
    }

    public int cellState(int cellBefore, int cellAfter){
        boolean compareCells = ((cellAfter^cellBefore) == 1);
        return compareCells ? 0:1;
    }




}
