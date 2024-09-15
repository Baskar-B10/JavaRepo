package com.testSkills;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharacterFromString {

    public static void main(String[] args) {
        String xmlString= "uewgdfgdhgfehhgjfgj";
        List<String> strings=Arrays.asList(xmlString.split(""));
       Map<String,Long> uniqueStringMap= strings.
                stream().
                collect(Collectors.groupingBy(s -> {return s;}, Collectors.counting()));
       List<String> outputResult=uniqueStringMap.entrySet().stream().filter((s) -> {
           return (Long) s.getValue() >1L;
       }).map(Map.Entry::getKey).collect(Collectors.toList());
       outputResult.forEach(System.out::println);
    }
}
