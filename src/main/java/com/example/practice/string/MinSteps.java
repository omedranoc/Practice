package com.example.practice.string;
import  java.util.*;
public class MinSteps {

    //[5, 2, 1]
    //
    public static String minSteps(String input, int time){
        // Mon -> 2 | Wed
        //Mon -> 7 | Mon.  7%7 =0
        //Mon -> 14| Mond   14%7 = 0
        // MOn ->20 | Sun.  14 % 7 = 6 + 2 %7 0
        //             Mon   tue     20 % 7  6 + 3 % 7 2
        String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        //                  1       2    3    4       5   6        7
        int position = time % 7;
        for(int i = 0 ;i < week.length; i ++ ){
            int day = i+1;
            if(week[i] == input)  {
                return week[(position + day)%7 -1];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String[] week = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        System.out.println(minSteps("Mon", 2));
        System.out.println(minSteps("Mon", 7));
    }
}
