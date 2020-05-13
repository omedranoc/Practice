package com.example.practice.string;

import java.util.HashSet;
import java.util.Set;

public class MakePalindrome {



    public String make(String s){
        Set<Character>  palindrome = new HashSet<>();
        for(int i =0 ; i < s.length(); i++){
            if(!palindrome.contains(s.charAt(i))){
                palindrome.remove(s.charAt(i));
            } else{
                palindrome.add(s.charAt(i));
            }

        }
        boolean isPalindrome = palindrome.size() < 2 ? true : false;
        // mamap
        //check if it can  be taken as a palindrome if it is get the palindrome
        // mamap   mampa  mapma  mapam
        //
        char[] characters = s.toCharArray();
        int initialP = 0;
        int finalP = s.length() -1;
        int k = finalP;
        for(int i =0 ; i < s.length(); i++){
            for(int j = s.length() -1; j > i; j--){
                if(characters[i] != characters[j] ){
                    finalP = j;
                    while(finalP >i){
                        char temp = characters[finalP];
                        characters[finalP] = characters[finalP-1];
                        characters[finalP-1] = temp;
                        finalP --;

                    }
                }

            }
        }


        return "";
    }

}
