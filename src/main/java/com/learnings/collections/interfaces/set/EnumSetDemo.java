package com.learnings.collections.interfaces.set;// Java program to demonstrate the
// creation of the set object
// using the EnumSet class
import java.util.*;

enum Data { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;

public class EnumSetDemo {

    public static void main(String[] args)
    {
        // Creating a set
        Set<Data> set1;

        // Adding the elements
        set1 = EnumSet.of(Data.QUIZ, Data.CONTRIBUTE,
                Data.LEARN, Data.CODE);

        System.out.println("Set 1: " + set1);
    }
}