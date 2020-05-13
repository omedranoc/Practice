package com.example.practice.datastructures;

public class HouseThief {
   // {6, 7, 1, 30, 8, 2 ,4}
    // o = 41
    // 7, 30, 4
    public int maxMoney( int[] input){
        return loop(input, 0);

    }

    private int loop (int [] input, int index){
        if(index >=  input.length){
            return 0;
        }
        int maxhouses =  input[index] + loop(input, index + 2);
        int skipHouses = loop(input, index + 1);
        return  Math.max(maxhouses, skipHouses);
    }


    public static void main(String[] args) {
        HouseThief ht = new HouseThief();
        int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(ht.maxMoney(HouseNetWorth));
        HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
        System.out.println(ht.maxMoney(HouseNetWorth));
    }



}
