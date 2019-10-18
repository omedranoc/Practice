package com.example.practice.pramp;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
//Award Budget Cuts
//        The awards committee of your alma mater (i.e. your college/university) asked for your assistance with a budget allocation problem they’re facing. Originally, the committee planned to give N research grants this year. However, due to spending cutbacks, the budget was reduced to newBudget dollars and now they need to reallocate the grants. The committee made a decision that they’d like to impact as few grant recipients as possible by applying a maximum cap on all grants. Every grant initially planned to be higher than cap will now be exactly cap dollars. Grants less or equal to cap, obviously, won’t be impacted.
//
//        Given an array grantsArray of the original grants and the reduced budget newBudget, write a function findGrantsCap that finds in the most efficient manner a cap such that the least number of recipients is impacted and that the new budget constraint is met (i.e. sum of the N reallocated grants equals to newBudget).
//
//        Analyze the time and space complexities of your solution.
public class AwardBudget {

    static double findGrantsCap(double[] grantsArray, double newBudget) {
        List<Double> grants = Arrays.stream(grantsArray).boxed().collect(Collectors.toList());
        grants.add(0.0);
        grants.sort(Collections.reverseOrder());

        double surplus = grants.stream().reduce(0.0, (a, b) -> a + b);
        surplus = surplus  - newBudget;
        int index = 0;
        if (surplus <= 0)
            return grants.get(0);
        for(int i = 0; i < grants.size() ; i++) {
            surplus -= (i+1) * (grants.get(i) - grants.get(i+1));
            if (surplus <= 0){
                index = i;
                break;
            }

        }
        return grants.get(index+1) + (- surplus / (index+1));
    }

    public static void main(String[] args) {
        double[] grantsArray = new double[]{2, 100, 50, 120, 1000};
        System.out.println(findGrantsCap(grantsArray, 190));
    }
}
