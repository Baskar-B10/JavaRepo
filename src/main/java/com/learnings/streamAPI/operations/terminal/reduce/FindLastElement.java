package com.learnings.streamAPI.operations.terminal.reduce;// Java program to find last
// element of a StreamDemo in Java using stream.reduce() method

import java.util.stream.*;

public class FindLastElement {

    // Function to find the
    // last_elements in a StreamDemo
    public static <T> T
    lastElementInStream(Stream<T> stream)
    {
        T last_element
            = stream

                  // reduce() method reduces the StreamDemo
                  // to a single element, which is last.
                  .reduce((first, second) -> second)

                  // if stream is empty
                  // null is returned
                  .orElse(null);

        return last_element;
    }

    // Driver code
    public static void main(String[] args)
    {

        Stream<String> stream
            = Stream.of("Geek_First", "Geek_2",
                        "Geek_3", "Geek_4",
                        "Geek_Last");

        // Print the last element of a StreamDemo
        System.out.println(
            "Last Element: "
            + lastElementInStream(stream));
    }
}
