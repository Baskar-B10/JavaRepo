package com.program.classes.polymorphism;
class SuperClassz {
    public Object method()
    {
        System.out.println(
                "This is the method in SuperClass");
        return new Object();
    }
}

class SubClassz extends SuperClassz {
    public String method()
    {
        System.out.println(
                "This is the method in SubClass");
        return "Hello, World!";
    }
}


public class MethodOverrideSameReturnType {
    public static void main(String[] args)
    {
        SuperClassz obj1 = new SuperClassz();
        obj1.method();

        SubClassz obj2 = new SubClassz();
        obj2.method();
    }
}
