package com.learnings.collections.interfaces.map;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictonaryOperationDemo {
    public static void main(String[] args) {

        // Create a Dictionary instance 
        // using Hashtable
        Dictionary<String, String> d = new Hashtable<>();

        // Add key-value pairs 
        d.put("Java", "1");
        d.put("Python", "2");

        print(d);

        // Retrieve a value using its key
        String v = d.get("Java");
        System.out.println("\nValue for key 'Java': " + v);

        // Check the number of key-value pairs
        System.out.println("Size of dictionary: " + d.size());

        // Check if the dictionary is empty
        System.out.println("Is dictionary empty? " + d.isEmpty());

        // Remove a key-value pair for given key 
        System.out.println("\nRemoving key 'Python'...");
        d.remove("Python");
        print(d);

        // Retrieve all keys 
        Enumeration<String> keys = d.keys();
        while (keys.hasMoreElements()) {
            String k = keys.nextElement();
            System.out.println("Key: " + k);
        }

        // Retrieve all values 
        Enumeration<String> values = d.elements();
        while (values.hasMoreElements()) {
            v = values.nextElement();
            System.out.println("Value: " + v);
        }
    }

    // Utility method to print all 
    // key-value pairs in the dictionary
    private static void print(Dictionary<String, String> d) {
        Enumeration<String> keys = d.keys();
        while (keys.hasMoreElements()) {
            String k = keys.nextElement();
            String v = d.get(k);
            System.out.println("Key: " + k + ", Value: " + v);
        }
    }
}