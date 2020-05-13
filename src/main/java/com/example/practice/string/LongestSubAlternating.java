package com.example.practice.string;

public class LongestSubAlternating {

//    baaabbabbb

    public  static  int longest(String input){

        //  loop through the array  if has more that 3 equal then delete 1
        if (input.length() < 3){
            return  input.length();
        }
        int len  = input.length();
        for(int i = 0; i < input.length() -2; i ++){
            System.out.println(i + " "+ (input.length() -3) + input.charAt(input.length() -1) + input.charAt(input.length()-2) + input.charAt(0));
            System.out.println(i + " "+ (i == input.length() -3 && (input.charAt(input.length() -1) == input.charAt(input.length()-2) )&& (input.charAt(input.length() -1) == input.charAt(0))));
            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == input.charAt(i +2)){
                len --;
            }
            if(i == input.length() -3 && (input.charAt(input.length() -1) == input.charAt(input.length()-2) )&& (input.charAt(input.length() -1) == input.charAt(0))){
                len --;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(longest("baaabbabbb"));
        System.out.println(longest("babba"));
    }
}
