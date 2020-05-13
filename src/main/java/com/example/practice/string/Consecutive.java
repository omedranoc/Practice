package com.example.practice.string;

public class Consecutive {

    public  int getNotConsecutive(String a){
        int value = 0;
        int pointer =0;
        while(pointer +3 < a.length() ){
            String parcialValue = a.substring(pointer,3 + pointer);
            if(parcialValue.charAt(0) == parcialValue.charAt(1) && parcialValue.charAt(0) ==parcialValue.charAt(2)){
                value += 1;
                pointer ++;

            }
            pointer +=1;
        }
        return value;
    }



}
