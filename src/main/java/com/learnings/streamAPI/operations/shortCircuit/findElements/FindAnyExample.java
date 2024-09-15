package com.learnings.streamAPI.operations.shortCircuit.findElements;// Java code for StreamDemo findAny()
// which returns an Optional describing
// some element of the stream, or an
// empty Optional if the stream is empty.
import java.util.*;

class FindAnyExample {
    // Driver code
    public static void main(String[] args)
    {
        // Creating a List of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using StreamDemo findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<Integer> answer = list.stream().findAny();

        // if the stream is empty, an empty
        // Optional is returned.
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }

        List<String> listString = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "OfNullableExample");

        // Using StreamDemo findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<String> answers = listString.stream().findAny();

        // if the stream is empty, an empty
        // Optional is returned.
        if (answers.isPresent()) {
            System.out.println(answers.get());
        }
        else {
            System.out.println("no value");
        }
    }
}