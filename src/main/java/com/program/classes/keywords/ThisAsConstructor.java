package com.program.classes.keywords;

public class ThisAsConstructor {


// Java code for using this() to
// invoke current class constructor

    int a;
    int b;

    // Default constructor
    ThisAsConstructor()
    {
        this(10, 20);
        System.out.println(
                "Inside default constructor \n");
    }

    // Parameterized constructor
    ThisAsConstructor(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(
                "Inside parameterized constructor");
        System.out.println(a + b);
    }

    public static void main(String[] args)
    {
        ThisAsConstructor object = new ThisAsConstructor();
    }
}

