package com.program.classes.polymorphism;

public class MOConstructorRule1 {
}
// Java program to demonstrate overriding when
// superclass method does not declare an exception

class ParentClssss {
    void m1() { System.out.println("From parent m1()"); }

    void m2() { System.out.println("From parent m2()"); }
}

class ChildClssss extends ParentClssss {
    @Override
        // no issue while throwing unchecked exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child m1()");
    }

    @Override
        // compile-time error
        // issue while throwing checked exception
    void m2() //throws Exception
    {
        System.out.println("From child m2");
    }
}
