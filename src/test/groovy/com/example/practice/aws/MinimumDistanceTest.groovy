package com.example.practice.aws

import com.example.practice.pramp.Solution
import spock.lang.Specification

class MinimumDistanceTest extends Specification {
   MinimumDistance solution = new  MinimumDistance()
   def "test"(){
    given:
    AwsTruck awsTruck = new AwsTruck();
    List<List<Integer>> area =  [
            [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
            [ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 ],
            [ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 ],
            [ 0, 0, 0, 0, 9, 0, 0, 0, 0, 1 ],
            [ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 ],
            [ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 ],
            [ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 ],
            [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
            [ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 ]
    ];
    when:
    int solution =awsTruck.minimumDistance(9, 10, area)
    then:
    solution == 11
   }

 def "test1"(){
  given:
  AwsTruck awsTruck = new AwsTruck();
  List<List<Integer>> area =  [
          [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
          [ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 ],
          [ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 ],
          [ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 ],
          [ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 ],
          [ 1, 0, 1, 1, 1, 1, 0, 1, 0, 1 ],
          [ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 ],
          [ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 ],
          [ 1, 1, 0, 0, 0, 0, 1, 0, 0, 9 ]
  ];
  when:
  int solution =awsTruck.minimumDistance(9, 10, area)
  then:
  solution == 11
 }


 def "dsadsa"(){
 given:
 Solution solution1 = new Solution()
 when:

 solution1.prioritizedOrders(1, ["r1 box ape bit", "br8 eat num did", "T2 13" ])
 then:
 1==1
 }


 def "dsfsdsadsa"(){
  given:
  Solution solution1 = new Solution()
  List<List<Integer>> f =  [[1,8],[2,7],[3,14]]
  List<List<Integer>> r = [[1,5],[2,10],[3,14]]


  when:
  solution1.optimalUtilization(20, f ,  r)
  then:
  1==1
 }


 def "dsfsdsasadsa"(){
  given:
  Solution solution1 = new Solution()
  List<List<Integer>> f =  [[1,8],[2,15],[3,9]]
  List<List<Integer>> r = [[1,8],[2,11],[3,12]]


  when:
  solution1.optimalUtilization(20, f ,  r)
  then:
  1==1
 }

}
