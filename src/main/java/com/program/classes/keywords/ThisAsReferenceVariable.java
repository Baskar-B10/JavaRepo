package com.program.classes.keywords;

public class ThisAsReferenceVariable {

    // Java code for using 'this' keyword to
// refer current class instance variables

        int a;
        int b;

        // Parameterized constructor
        ThisAsReferenceVariable(int a, int b)
        {
            this.a = a;
            this.b = b;
        }

        void display()
        {
            // Displaying value of variables a and b
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args)
        {
            ThisAsReferenceVariable object = new ThisAsReferenceVariable(10, 20);
            object.display();
        }


}
