package com.practice.printPattern;

import java.util.*;
import java.util.stream.Collectors;

public class PrintBracketNumbers {
    public static void main(String[] args) {
        String str="(aa(bdc))p(dee)";
        bracketNumbers(str);
    }
   public static  ArrayList<Integer> bracketNumbers(String str) {
        // code here
       int i=0;


       ArrayList<Integer> output =new ArrayList<Integer>();
        List<String> list= Arrays.asList(str.split(""));

       Stack<Integer> balance= new Stack<Integer>();
 for (String s:list){

    if(s.contains("(")){
        ++i;
        balance.push(i);
        output.add(i);
    } else if (s.contains(")")) {

if(!balance.isEmpty()){
    output.add(balance.pop());
}

    }
}


System.out.println(output);
       return output;
    }
}
