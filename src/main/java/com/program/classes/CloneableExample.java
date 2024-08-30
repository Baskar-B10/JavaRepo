package com.program.classes;// Java program to Illustrate Creation of Object
// Using new Instance

// OverloadingMain class
class CloneableExample implements Cloneable {

    // Declaring and initializing string
    String name = "GeeksForGeeks";
    // Method 1
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }


    // OverloadingMain driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        /*try {*/
            /*Class cls = Class.forName("CloneableExample");
            // Creating object of main class
            // using instance method
            CloneableExample obj = (CloneableExample) cls.newInstance();
            // Print and display
            System.out.println(obj.name);*/

            CloneableExample obj1 = new CloneableExample();
            // Try block to check for exceptions
            try {
                CloneableExample obj2 = (CloneableExample)obj1.clone();
                System.out.println(obj2.name);
            }
            catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
       /* }
        *//*catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {

            e.printStackTrace();
        }
        catch (IllegalAccessException e) {

            e.printStackTrace();
        }*/
    }
}
