package com.learnings.collections.classes;// Binary Search using Collections.binarySearch()
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        // Adding elements to object
        // using add() method
        l.add("Shoes");
        l.add("Toys");
        l.add("Horse");
        l.add("Ball");
        l.add("Grapes");

        // Sort the List
        Collections.sort(l);

        // BinarySearch on the List
        System.out.println(
            "The index of Horse is: "
            + Collections.binarySearch(l, "Horse"));

        // BinarySearch on the List
        System.out.println(
            "The index of Dog is: "
            + Collections.binarySearch(l, "Dog"));
    }
}