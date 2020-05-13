package com.example.practice.leetcode;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return  0;
        int firstElement = nums[0];
        int[] solution = new int[nums.length];
        int max = firstElement;
        solution[0] = firstElement;
        for(int i = 0; i< nums.length -1; i++){
            int temporalMax = Integer.max(solution[i] + nums[i + 1], nums[i + 1]);
            solution[i+1] = temporalMax;
            System.out.println("elements: " +nums[i]);
            System.out.println("Solution: "+ solution[i]);
            System.out.println("temporalMax: "+ temporalMax);
            System.out.println("max"+Integer.max(max, temporalMax));
            max = Integer.max(max, temporalMax);
        }
        return  max;


    }
}
