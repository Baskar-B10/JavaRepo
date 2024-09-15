package com.learnings.streamAPI.operations.shortCircuit.match;

import java.util.stream.IntStream;

public class AllMatchExampleForCharacter {

    public static void main(String[] args) {
        final String sample = "Om Sarve Bhavantu Sukhinah";

        // converting to Ascii
        IntStream intstreams = sample.chars();

        // All match to check if all Ascii value greater than 100
        boolean answer = intstreams.allMatch(c -> c > 100);
        System.out.println(answer);

        // Need to initialize the stream again
        // to avoid runtime exception
        intstreams = sample.chars();
        // All match to check if all Ascii value greater than 31

        answer = intstreams.allMatch(c -> c > 31);
        System.out.println(answer);
    }
}
