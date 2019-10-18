package com.example.practice.aws;

import java.util.*;
import java.util.stream.Collectors;

public class SecondsSong {

    //returns the id of the songs that have to endd before 30 seconds

    public List<Integer> idOfSongs(int rideDuration, List<Integer> songDuration){
        Map<Integer, Integer> idsMap = new HashMap<>();
        for(int i = 0; i < songDuration.size() ; i++) {
            idsMap.put(songDuration.get(i), i);
        }

        List<Integer> solution = new ArrayList<>();
       songDuration.sort(Comparator.reverseOrder());
        for(int i = 0; i < songDuration.size() ; i++) {
            if(songDuration.get(i) < (rideDuration - 30))
                for(int j = i+1; j < songDuration.size() ; j++) {
                    if(songDuration.get(i) + songDuration.get(j) == rideDuration - 30) {
                        solution.add(idsMap.get(songDuration.get(j)));
                        solution.add(idsMap.get(songDuration.get(i)));
                        return  solution;
                    }
                }

            }
        return  new ArrayList<>();
        }





}
