package com.example.practice.hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sherlock {

    static String isValid(String s) {
        Map<Character, Integer> frecuency = new HashMap();
        for(int i = 0; i < s.length(); i++){
            frecuency.put(s.charAt(i), frecuency.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Integer, Integer> wordsFrecuency = new HashMap<>();
        frecuency.forEach( (k, v) -> {
            wordsFrecuency.put(v, wordsFrecuency.getOrDefault(v, 0)+1);
        });
        List<Integer> values = new ArrayList(wordsFrecuency.values());
        List<Integer> keys = new ArrayList(wordsFrecuency.keySet());

        if(wordsFrecuency.size()>2
                ||(keys.size() == 2 && (keys.get(0)!=1 && keys.get(1)!=1) && Math.abs(keys.get(0) - keys.get(1))>1)
                || (values.size() == 2 && values.get(0)>1&&values.get(1)>1))
            return "NO";

        return "YES";
    }


}
