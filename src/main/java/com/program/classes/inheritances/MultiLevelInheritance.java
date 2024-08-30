package com.program.classes.inheritances;// Importing required libraries
import java.lang.*;

// Parent class One
class Class1 {
    // Method to print "Geeks"
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Child class Two inherits from class One
class Class2 extends Class1 {
    // Method to print "for"
    public void print_for() {
        System.out.println("for");
    }
}

// Child class Three inherits from class Two
class Class3 extends Class2 {
    // Method to print "Geeks"
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}

// Driver class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of class Three
        Class3 g = new Class3();
        
        // Calling method from class One
        g.print_geek();
        
        // Calling method from class Two
        g.print_for();
        
        // Calling method from class Three
        g.print_lastgeek();
    }
}
