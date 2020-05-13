package com.example.practice.string;

public class Lexicographically {


    public String getMinimum(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        String solution = "";
        for(int i = 0; i < s.length() -1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                solution = s.substring(0,i) + s.substring(i+1);
            }
        }
        return  solution == ""? s.substring( 0, s.length()-1):solution;
    }

}
