package com.program.classes.polymorphism;


// PublicMethods Java program to demonstrate that overridden
// method can be called from sub-class

// Base Class
class ParentClazz {
    void show() {
        System.out.println("Parent's show()"); }
}

// Inherited class
class ChildClazz  extends ParentClazz  {
    // This method overrides show() of Parent
    @Override void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}

// Driver class


public class MethodOverrideFromSubClass {
    public static void main(String[] args)
    {
        ParentClazz  obj = new ChildClazz ();
        obj.show();
    }
}
