package com.example.practice.hackerRank;

import java.util.*;

public class SpecialString {
//   01 02 03 04 05
//   12 13 14 15
    static long substrCount(int n, String s) {
        int solution  = 0;
        int window = 2;

        Map<Character, Integer> caractersCount = new TreeMap<>();
        for(int i = 0; i < s.length(); i++){
            caractersCount.put(s.charAt(i), caractersCount.getOrDefault(s.charAt(i), 0) +1);
        }

        for(int i =0; i < s.length(); i++){
            HashMap<String, Boolean> specialCharacters = new HashMap<>();
            for (int j = i + window ; j <= s.length(); j++){

                if(specialCharacters.getOrDefault(s.substring(i, j), false)|| isSpecial(s.substring(i, j))){
                    specialCharacters.put(s.substring(i, j), true);
                    solution++;
                }
                else{
                    specialCharacters.put(s.substring(i, j), false);
                }

            }

        }
     return  solution +s.length();

    }
    static boolean isSpecial(String subString){
        Map<Character, Integer> caractersCount = new HashMap();
        for(int i = 0; i < subString.length(); i++){
            caractersCount.put(subString.charAt(i), caractersCount.getOrDefault(subString.charAt(i), 0) +1);
        }
        if(caractersCount.size() > 2)
            return false;
        long caracters = caractersCount.entrySet().stream().filter(e ->e.getValue()==1).count();
        if(
                ( subString.length() %2 == 0 && caractersCount.size() == 1 )  ||
                (  subString.length() %2 == 1 && caractersCount.size() == 1)||
                (subString.length() %2 != 0 &&caractersCount.size() == 2 && caracters ==1 ))
            return true;

        return false;

    }
}





