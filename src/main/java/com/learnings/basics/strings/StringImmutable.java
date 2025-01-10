package com.learnings.basics.strings;// Java Program to demonstrate Immutable String in Java

class StringImmutable {
    public static void main(String[] args)
    {
        String s = "Sachin";
    
        // concat() method appends
        // the string at the end
        s.concat(" Tendulkar");
    
        // This will print Sachin
        // because strings are
        // immutable objects
        System.out.println(s);
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }
}