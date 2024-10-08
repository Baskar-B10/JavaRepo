package com.program.classes.singleton;



    // Java program implementing Singleton class
// with method name as that of class

    // Class 1
// Helper class
    class Singleton2 {
        // Static variable single_instance of type Singleton
        private static Singleton2 single_instance = null;

        // Declaring a variable of type String
        public String s;

        // Constructor of this class
        // Here private constructor is used to
        // restricted to this class itself
        private Singleton2()
        {
            s = "Hello I am a string part of Singleton class";
        }

        // Method
        // Static method to create instance of Singleton class
        public static Singleton2 Singleton2()
        {
            // To ensure only one instance is created
            if (single_instance == null) {
                single_instance = new Singleton2();
            }
            return single_instance;
        }
    }

    // Class 2
// OverloadingMain class
    class GFG2 {
        // OverloadingMain driver method
        public static void main(String args[])
        {
            // Instantiating Singleton class with variable x
            Singleton2 x = Singleton2.Singleton2();

            // Instantiating Singleton class with variable y
            Singleton2 y = Singleton2.Singleton2();

            // instantiating Singleton class with variable z
            Singleton2 z = Singleton2.Singleton2();

            // Now changing variable of instance x
            // via toUpperCase() method
            x.s = (x.s).toUpperCase();

            // Print and display commands
            System.out.println("String from x is " + x.s);
            System.out.println("String from y is " + y.s);
            System.out.println("String from z is " + z.s);
            System.out.println("\n");

            // Now again changing variable of instance z
            z.s = (z.s).toLowerCase();

            System.out.println("String from x is " + x.s);
            System.out.println("String from y is " + y.s);
            System.out.println("String from z is " + z.s);
        }
    }


