package com.program.classes.polymorphism;

public class MOConstructorRule2 {
}
// Java program to demonstrate overriding when
// superclass method does declare an exception

class ParentClazs {
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}

class Child1Clazs  extends ParentClazs  {
    @Override
        // no issue while throwing same exception
    void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }
}
class Child2Clazs  extends ParentClazs  {
    @Override
        // no issue while throwing subclass exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child2 m1()");
    }
}
class Child3Clazs  extends ParentClazs  {
    @Override
        // no issue while not throwing any exception
    void m1()
    {
        System.out.println("From child3 m1()");
    }
}
class Child4Clazs  extends ParentClazs  {
    @Override
        // compile-time error
        // issue while throwing parent exception
    void m1() //throws Exception
    {
        System.out.println("From child4 m1()");
    }
}
