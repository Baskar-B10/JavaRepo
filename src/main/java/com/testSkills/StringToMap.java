package com.testSkills;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToMap {



    public static void main(String[] args) {
        String a= "abcdeaewrgrfvdfgereqwe";
      System.out.println(Stream.of(a.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));  ;
    }
}
