package com.program.classes.accessModifier.package1;

// Class PublicMethods
class AA {
    private void display()
    {
        System.out.println("GeeksforGeeks");
    }
}

// Class B
class B {
    public static void main(String args[])
    {
        AA obj = new AA();
        // Trying to access private method
        // of another class
        //obj.display();
        //compile error
    }
}