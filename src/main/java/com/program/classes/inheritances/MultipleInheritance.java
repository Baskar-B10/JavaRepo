package com.program.classes.inheritances;// Java program to illustrate the
// concept of Multiple inheritance
import java.lang.*;

interface Inheritance1 {
    public void print_geek();
}

interface Inheritance2 {
    public void print_for();
}

interface Inheritance3 extends Inheritance1, Inheritance2 {
    public void print_geek();
}
class Child implements Inheritance3 {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

// Drived class
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
