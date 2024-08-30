package com.program.classes.keywords;

public class SuperConstructor2 {

    public static void main(String[] args)
    {
        ChildConstructor child = new ChildConstructor();
        // calls child implementation
        // of isTrue()
        boolean result = child.isTrue();

        // prints "false"
        System.out.println(result);
    }
}
class ParentConstructor {
    public boolean isTrue() { return true; }
}

class ChildConstructor extends ParentConstructor {
    public boolean isTrue()
    {
        // calls parent implementation of isTrue()
        boolean parentResult = super.isTrue();
        // negates the parent result
        return !parentResult;
    }
}



