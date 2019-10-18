package com.example.practice.aws;

import java.util.*;
import java.util.stream.Collectors;

public class Solution
{
    public List<String> prioritizedOrders(int numOrders, List<String> orderList)
    {
        List<String> primeList =  orderList.stream()
                .filter(p -> !((String)p).split(" ")[1]
                        .matches("[0-9]+"))
                .sorted(Comparator.comparing(c -> ((String)c).split(" ")[1]))
            .collect(Collectors.toList());

        List<String> nonPrimeList  =  orderList.stream()
                .filter(p -> ((String)p).split(" ")[1].matches("[0-9]+")).sorted(   Comparator.reverseOrder())
                .collect(Collectors.toList());

        primeList.addAll(nonPrimeList);
        return primeList;
        // WRITE YOUR CODE HERE
    }


    public List<List<Integer>> optimalUtilization(int maxTravelDist,
                                           List<List<Integer>> forwardRouteList,
                                           List<List<Integer>> returnRouteList)
    {
        
        List<List<Integer>> temporalList = new ArrayList();
        List<List<Integer>> solution = new ArrayList();
        Map<Integer, Integer> bucketValues = new HashMap();
        forwardRouteList.forEach(route -> bucketValues.put(route.get(1), route.get(0)));
        Map<Integer, Integer> bucketValuesReturn = new HashMap();
        returnRouteList.forEach(route -> bucketValuesReturn.put(route.get(1), route.get(0)));
        returnRouteList.forEach(route ->{
            if(bucketValues.get(maxTravelDist- route.get(1)) != null){
                solution.add(new ArrayList(Arrays.asList(bucketValues.get(maxTravelDist- (Integer) route.get(1)), route.get(0)))
                );
            }
            else {
                List<List<Integer>> collect = forwardRouteList.stream()
                        .filter(forwardR -> route.get(1) + forwardR.get(1) < maxTravelDist)
                        .map(r ->new ArrayList<>(Arrays.asList(route.get(1) , r.get(1))))
                        .collect(Collectors.toList());
                temporalList.addAll(collect);

            }
        });
        if(!temporalList.isEmpty() && solution.isEmpty()){
            List<Integer> maxValues = Collections.singletonList(temporalList.stream().max(Comparator.comparing(v -> v.get(0) + v.get(1))).get()).get(0);

            solution.add(new ArrayList<>(Arrays.asList(bucketValues.get(maxValues.get(1)), bucketValuesReturn.get(maxValues.get(0)))));
        }
        solution.sort(Comparator.comparing(l -> l.get(0)));  
        return   solution;
        // WRITE YOUR CODE HERE
    }


}
