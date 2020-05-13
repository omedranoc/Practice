package com.example.practice.string;

public class Solution {
    static int  solution;

    static int decodeVariations(String S) {
        recursion(S, S.length());
        return solution;

    }

    private static int recursion(String S, int i){
        if(i == 0 || new Integer(S) > 26 ){
            return  0;
        }else if(new Integer(S) <= 26){
            return 1;
        }
        System.out.println(S.substring(0, i - 2));
        solution += recursion(S.substring(0, i - 2), i-2);

        return solution;

    }

    public static void main(String[] args) {
        System.out.println(decodeVariations("1262"));
    }

}
