package com.learnings.streamAPI.operations.terminal.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachOrderVsForEachInParallel {

    public static void main(String[] args) {



        List<String> listStringp = Arrays.asList("OfNullableExample", "Geeks",
                "for", "GeeksforGeeks");

     System.out.println("forEach:");
        listStringp.parallelStream().forEach(System.out::println);

        List<String> listStringporder = Arrays.asList("OfNullableExample", "Geeks",
                "for", "GeeksforGeeks");

        System.out.println("forEachOrdered:");
        listStringporder.parallelStream().forEachOrdered(System.out::println);


    }
}
