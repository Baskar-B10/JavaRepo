package com.learnings.basics.exceptionHandling.tryCatch;// Java Program to Demonstrate try catch block
// with multiple catch statements

class TryCatchDemo {
    public static void main(String[] args) {
        try {

            // ArithmeticException
            int res = 10 / 0;

            // NullPointerException
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Caught ArithmeticException: " + e);
        }
        catch (NullPointerException e) {
            System.out.println(
                "Caught NullPointerException: " + e);
        }
    }
}