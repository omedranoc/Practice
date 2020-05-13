package com.example.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> anagramS = new HashMap();
        List a = new ArrayList(anagramS.values());
        HashMap<Character, Integer> anagramT = new HashMap();
        for(int i = 0; i < t.length(); i++){
            Character valueS =  s.charAt(i);
            Character valueT =  t.charAt(i);
            Integer valueMapS =  anagramS.get(valueS) != null ? anagramS.get(valueS) +1: 0;
            Integer valueMapT =  anagramT.get(valueT) != null ? anagramT.get(valueT) +1: 0;

            anagramS.put(s.charAt(i), valueMapS);
            anagramT.put(t.charAt(i), valueMapT);
        }
        if(anagramS.size()!= anagramT.size()) return false;
        for(int i = 0; i < anagramS.size(); i++){
            if(!anagramS.get(s.charAt(i)).equals(anagramT.get(s.charAt(i)))){
                return false;
            }
        }
        return true;



    }
}
