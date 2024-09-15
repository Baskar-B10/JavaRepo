package com.learnings.streamAPI.operations.intermediate.filter;// Java Program to illustrate FILTER
// & COLLECT Operations
import java.util.*;
import java.util.stream.*;

// FindLastElementsUsingReverseSort class
public class FilterEvenNumber {

    // FindLastElementsUsingReverseSort driver method
    public static void main(String[] args)
    {
        // Creating an ArrayList object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        // First lets print the collection
        System.out.println("Printing the collection : "
                           + al);

        // Printing new line for better output readability
        System.out.println();

        // StreamDemo operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        List<Integer> ls
            = al.stream().filter(integer -> integer%2==0).collect(Collectors.toList());

        // Print the collection after stream operation
        // as stored in List object
        System.out.println(
            "Printing the List after stream operation : "
            + ls);
    }
}
