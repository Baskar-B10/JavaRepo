package com.learnings.collections.interfaces.map;// Java Program to Illustrate the LinkedHashmap Class

import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args)
    {

        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
}