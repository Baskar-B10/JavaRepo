package com.learnings.collections.interfaces.map;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictonaryDemo {
    public static void main(String[] args) {
      
        // create a Dictionary instance 
        // using Hashtable
        Dictionary<String, Integer> d = new Hashtable<>();

        // Adding key-value pairs
        d.put("A", 25);
        d.put("B", 30);
        d.put("C", 35);

        // Retrieving a value using a key
        System.out.println("Value of B: " + d.get("B")); 

        // Replacing an existing value
        int oldValue = d.put("C", 40);
        System.out.println("Old Value of C: " + oldValue); 

        // Removing a key-value pair
        d.remove("A");

        // Displaying remaining key-value pairs
        Enumeration<String> k = d.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Key: " + key + ", Value: " + d.get(key));
        }
    }
}