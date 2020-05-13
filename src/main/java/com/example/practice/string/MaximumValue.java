package com.example.practice.string;

public class MaximumValue {

    static public int  MaximumPossibleValue(int N) {
        boolean flag =  N>=0?true: false;
        String n = Integer.toString(N);
        StringBuilder s = new StringBuilder(n);
        if(s.length() == 0) {return  0;}
        int pointer = 0;
        while (pointer < s.length()){
            if (flag&&Character.getNumericValue(n.charAt(pointer)) < 5){
                break;
            }
            else if (!flag&&Character.getNumericValue(n.charAt(pointer)) > 5){
                break;
            }
            pointer++;
        }
        s.insert(pointer, 5);

      return new Integer(s.toString());

    }

}
