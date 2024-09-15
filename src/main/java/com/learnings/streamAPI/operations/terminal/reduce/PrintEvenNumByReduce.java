package com.learnings.streamAPI.operations.terminal.reduce;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class PrintEvenNumByReduce {
    public static void main(String[] args)
    {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        // <U> U reduce(U identity,
        //                 BiFunction<U, ? super T, U> accumulator,
        //                 BinaryOperator<U> combiner);
        List<Integer> even
               = arr.stream().reduce(new ArrayList<Integer>(),(i, j)
                        -> {
                    if (j % 2 == 0)
                        i.add(j);
                    return i;
                },
                (a, b) -> {
                    a.addAll(b);
                    return a;
                }
                );
        System.out.println(even);
    }
}
