package com.program.classes.keywords;

public class ThisAsClassInstance {

    // Java code for using 'this' keyword
// to return the current class instance

        int a;
        int b;

        // Default constructor
        ThisAsClassInstance()
        {
            a = 10;
            b = 20;
        }

        // Method that returns current class instance
        ThisAsClassInstance get() { return this; }

        // Displaying value of variables a and b
        void display()
        {
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args)
        {
            ThisAsClassInstance object = new ThisAsClassInstance();
            object.get().display();
        }


}
