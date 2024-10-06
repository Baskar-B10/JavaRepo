package com.testSkills;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FactorialSumSpecialNumber {

    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<Integer>();
        arrays.add(100);
        arrays.add(122);
        arrays.add(720);
        arrays.add(360);
        int results=factorialSum(arrays, arrays.size());
        System.out.println(results);
     }

     public static int factorialSum(List<Integer> array, int length){
        int count =0;
        for (int i=0; i<length;i++){
           int sumVal= sumOfNumber(array.get(i));
            //System.out.println("number: "+ array.get(i) + "sumVal: "+sumVal);

           int factVal= factorial(sumVal);
           // System.out.println("number: "+ array.get(i) + "factVal: "+factVal);

           Set<Integer> valSet= digits(array.get(i));
            Set<Integer> FactSet=    digits(factVal);
            //System.out.println("valSet: "+ valSet + "FactSet"+ FactSet);
          if(FactSet.containsAll(valSet)){
              count++;
          }
        }
        return count;


     }

    public static int sumOfNumber(int val){
        if(val<=9){
            return val;

        }else{
            String strVal =String.valueOf(val);
            String[] str =strVal.split("");
            int b=0;
            for (String s: str){
                 b = b+Integer.parseInt(s);
            }
            return sumOfNumber(b);
        }
    }

    public static int factorial(int val){

        if(val ==0 || val==1){
            return 1;

        }else{
            return val * factorial(val-1);
        }
    }

    public static Set<Integer> digits(int val){
        Set<Integer> set = new HashSet<Integer>();
        String strVal =String.valueOf(val);
        String[] str =strVal.split("");
        int b=0;
        for (String s: str){
            set.add(Integer.parseInt(s));
        }
        return set;

    }


}
