package com.learnings.streamAPI.operations.terminal.collect;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArrayList {
    // Driver code
    public static void main(String args[])
    {

        Stream<Integer>
                stream = Stream.of(1, 2, 3, 4, 5);

        // Convert StreamDemo to ArrayList in Java
        ArrayList<Integer>
                arrayList = new ArrayList<Integer>(stream.collect(Collectors.toList()));

        // Print the arraylist
        System.out.println("ArrayList: " + arrayList);
        Stream<Integer>
                stream1 = Stream.of(1, 2, 3, 4, 5);

        System.out.println("ArrayList using New: " + getArrayListFromStream(stream1));
    }

    public static <T> ArrayList<T>
    getArrayListFromStream(Stream<T> stream)
    {

        // Convert the StreamDemo to ArrayList
        ArrayList<T>
                arrayList = stream
                .collect(Collectors
                        .toCollection(ArrayList::new));

        // Return the ArrayList
        return arrayList;
    }
}
