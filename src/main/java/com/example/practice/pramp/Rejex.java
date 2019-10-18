package com.example.practice.pramp;

class Rejex {
    boolean isMatch(String text, String pattern) {
        if(!pattern.contains(".") && !pattern.contains("*")) {
            if(text.length() != pattern.length())
                return false;
        } else {
            int index = 0;
            int patternIndex = 0;
            while (patternIndex < pattern.length() && index < text.length()) {
                while(patternIndex < pattern.length() - 1 && pattern.charAt(patternIndex + 1) == '*') {
                   int[] indexes =getIndexes(text, index, pattern, patternIndex);
                   patternIndex = indexes[0];
                   index = indexes[1];

                }
                if(patternIndex < pattern.length() - 1 && !compareCharacter(text.charAt(index), pattern.charAt(patternIndex))) {
                    return false;
                }
                index++;
                patternIndex++;
                if(patternIndex >= pattern.length()&& index < text.length()){
                    if(pattern.charAt(pattern.length()-1) =='*')
                        return true;
                    return  false;
                }
            }
        }
        return true;
    }
    private static int[] getIndexes(String text, int index ,String pattern, int patternIndex ) {
        int[] indexes = new int[]{patternIndex +2 , index};
        String partialString = text.substring(index);
        int i = 0;
        while(i< partialString.length()&&partialString.charAt(i)== pattern.charAt(patternIndex)){
                indexes[1] += 1;
            i++;
        }
        return indexes;
    }


    private static boolean compareCharacter(char text, char pattern) {
        if(text == pattern || pattern == '.' || pattern == '*')
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
    }
}