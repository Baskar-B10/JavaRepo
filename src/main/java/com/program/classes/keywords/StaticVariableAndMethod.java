package com.program.classes.keywords;// PublicMethods java program to demonstrate use of
// static keyword with methods and variables

// Student class
class StudentStatic {
    String name;
    int rollNo;

    // static variable
    static String cllgName;

    // static counter to set unique roll no
    static int counter = 0;

    public StudentStatic(String name)
    {
        this.name = name;

        this.rollNo = setRollNo();
    }

    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }

    // static method
    static void setCllg(String name) { cllgName = name; }

    // instance method
    void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);

        // accessing static variable
        System.out.println("cllgName : " + cllgName);
    }
}

// Driver class
public class StaticVariableAndMethod {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        StudentStatic.setCllg("XYZ");

        StudentStatic s1 = new StudentStatic("Alice");
        StudentStatic s2 = new StudentStatic("Bob");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}
