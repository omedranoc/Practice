package com.example.practice.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public int lis(final int[] A) {
        if (A == null || A.length == 0)
        {
            return 0;
        }

        List<Integer> solution = new ArrayList();

        if(A.length == 1)
            return A.length;
        if(A[0]<A[1]){
            solution.add(A[0]);
        }
        for(int i = 1;  i < A.length; i++)  {
            if(A[i -1] < A[i]){
                if(solution.size() ==0)
                    solution.add(A[i-1]);
                if( solution.get(solution.size()-1) < A[i])
                    solution.add(A[i]);
            }
        }

        return solution.size() == 0 ? 1: solution.size();
    }

}
