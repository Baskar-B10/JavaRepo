package com.program.classes.keywords;

public class SuperConstructor1 {
    public static void main(String[] args)
    {
        StudentClass s = new StudentClass();
    }
}
// Java Code to show use of
// super keyword with constructor

// superclass Person
class PersonClass {
    PersonClass()
    {
        System.out.println("Person class Constructor");
    }
}

// subclass Student extending the Person class
class StudentClass extends PersonClass {
    StudentClass()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

// Driver Program

