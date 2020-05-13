package com.example.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStream {
    public int lengthOfLongestSubstring(String s) {
        // if(s != null && s.isEmpty())
        int ret = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, start = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                System.out.println(c);  // a, start 1
                System.out.println("map :" +map.get(c));

                start = Math.max(map.get(c)+1, start);
                System.out.println("start :" +start);
            }
            ret = Math.max(ret, i-start+1);
            map.put(c, i);
        }
                return ret;

    }
}
