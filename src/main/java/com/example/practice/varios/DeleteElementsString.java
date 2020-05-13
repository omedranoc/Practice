package com.example.practice.varios;

public class DeleteElementsString {

    static int deletionDistance(String str1, String str2) {
     int[] solution= new int[str1.length()];


        return findMinOperationsAux( str1, str2, 0, 0);
    }

    static int findMinOperationsAux(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length()){
            System.out.println(" i1 " + i1+" "+i2+" "+ (s1.length() - i1));
            return s2.length() - i2;
        }

        if (i2 == s2.length()) {
            System.out.println(" i1 " + i1+" "+i2+" "+ (s2.length() - i2));
            return s1.length() - i1;
        }


        if (s1.charAt(i1) == s2.charAt(i2)) {
            System.out.println("inside " +i1+" "+i2+" s1 "+s1.charAt(i1)+" s2 "+ s2.charAt(i2));
            return findMinOperationsAux(s1, s2, i1 + 1, i2 + 1);
        }
        System.out.println("before " +i1+" "+i2);
        int c1 = 1 + findMinOperationsAux(s1, s2, i1 + 1, i2); // perform deletion
        System.out.println("after " +i1+" "+i2+" "+ c1);
        int c2 = 1 + findMinOperationsAux(s1, s2, i1, i2 + 1); // perform insertion
        System.out.println("after  c2 " +i1+" "+i2+" "+ c1 +" "+c2);
        //int c3 = 1 + findMinOperativbonsAux(s1, s2, i1 + 1, i2 + 1); // perform replacement
        System.out.println("min " +c1+" "+c2+" "+ Math.min(c1 ,c2));
        return Math.min(c1 ,c2);
    }//end of method


  static int dp (String s1, String s2){
        int[][] solution = new int[s1.length()][s2.length()];
        solution[0][0] =  0;
        for (int i = 1; i < s1.length(); i++){
            for (int j = 1; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    solution[i][j] = Math.min(solution[i-1][j], Math.min(solution[i][j -1], solution[i-1][j -1]));
                }
                else{
                    solution[i][j] = solution[i-1][j] + solution[i][j -1] - solution[i-1][j -1];
                }
            }
        }

        return solution[s1.length() -1][s2.length() -1];

    }

    /*
             h i t
           0 1 2 3        s1[i] == s2[j] ->   MinVal
        h  1 0 1 2
        e  2 1 2 3
        a  3 2 3 4
        t  4 3 4 3

            h 0 t       s1[i] != s2[j]     ->   s[i -1][j] + s[i][j -1] - s[i-1][j-1];
          0 1 2 3
        n 1 2 3 4
        o 2 3 2 3
        s 3 4 3 5
     */

     //                      heat     hit
     //    eat
    //     at
    //

    public static void main(String[] args) {
        System.out.println( deletionDistance(  "heat", "hit"));
        System.out.println( deletionDistance(  "heat", "hi"));
//      System.out.println( deletionDistance(  "hot", "hot"));
//      System.out.println( deletionDistance(  "potat", "hotat"));
//        System.out.println( deletionDistance(  "hot", "pot"));
//        System.out.println( deletionDistance(  "some", "thing"));
    }
}

