package com.example.practice.pramp;

public class Solution2 {

    static int decodeVariations(String S) {
        Integer solution = 0;
        for (int i =0; i <= S.length() -2; i++){
            System.out.println(new Integer(S.substring(i, i +2)) );
            if(new Integer(S.substring(i, i +2)) <= 26){
                solution ++;
            }
        }
        return solution + 1;
    }

    public static void main(String[] args) {
        System.out.println(decodeVariations("1270"));
    }
}
