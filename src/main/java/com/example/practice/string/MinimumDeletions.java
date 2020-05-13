package com.example.practice.string;

import java.util.*;

public class MinimumDeletions {



    public int minimum(String source){
        char[] sArray = source.toCharArray();
        Map<Character, Integer> frecuencyTable = new HashMap<Character, Integer>() ;
        for(char v: sArray){
          frecuencyTable.put(v, frecuencyTable.getOrDefault(v,0)+1);
        }
        int deletionCount;


        //3, 3, 4, 2 |  decrease 1 , check if there are more in that level
        Set fValues = new HashSet();
        int deletions =0;
        for(int frecuency: frecuencyTable.values()){
            System.out.println("frecuency");
            System.out.println(frecuency);
            if(!fValues.contains(frecuency)){
                fValues.add(frecuency);
            }else {
                System.out.println(frecuency);
                frecuency --;
                deletions ++;
                System.out.println("deletions " +deletions);
                if(fValues.contains(frecuency))
                    while(fValues.contains(frecuency)){
                        System.out.println("a"+frecuency);
                        frecuency --;
                        deletions ++;
                        System.out.println("deletions 2 " +deletions);
                    }
                else {
                     fValues.add(frecuency);

                }

            }

        }

        // frecuency
        // want to delete elements in that frecuency until there are not equal



        return deletions;
    }


}
