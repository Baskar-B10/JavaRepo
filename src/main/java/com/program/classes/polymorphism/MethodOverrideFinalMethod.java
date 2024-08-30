package com.program.classes.polymorphism;

public class MethodOverrideFinalMethod {

    // PublicMethods Java program to demonstrate that
// final methods cannot be overridden

    class ParentC {
        // Can't be overridden
        final void show() {}
    }

    class ChildC extends ParentC {
        // This would produce error
        //void show() {}
    }

}
