package com.program.basic;

public class EvenOrOddNumbers {
  // OverloadingMain Driver Method
        public static void main(String[] args)
        {
            // Declaring and initializing integer variable
            OddOrEven(10);
            OddOrEvenUsingOrOperator(10);
            OddOrEvenUsingAndOperator(15);
            OddOrEvenUsingXorOperator(20);
            System.out.println(testOddEvenByCheckingLSB(18));

        }

public  static void  OddOrEven(int num){
    // Checking if number is even or odd number
    // via remainder
    if (num % 2 == 0) {
 // If remainder is zero then this number is even
        System.out.println("Entered Number is Even");
    }
    else {
          // If remainder is not zero then this number is
        // odd
        System.out.println("Entered Number is Odd");
    }
}

    public  static void  OddOrEvenUsingOrOperator(int n){
        if ((n | 1) > n) {

            // Print statement
            System.out.println("Number is Even");
        }
        else {

            // Print statement
            System.out.println("Number is Odd");
        }
    }

    public  static void  OddOrEvenUsingAndOperator(int n){
        if ((n & 1) == 1) {

            // Print statement
            System.out.println("Number is Odd");
        }
        else {

            // Print statement
            System.out.println("Number is Even");
        }
    }

    public  static void  OddOrEvenUsingXorOperator(int num){
        if ((num ^ 1) == num + 1) {

            // Print statement
            System.out.println("Number is Even");
        }
        else {

            // Print statement
            System.out.println("Number is Odd");
        }
    }

    public static String testOddEvenByCheckingLSB(int a)
    {

        if (a != 0) {
            if (Integer.toBinaryString(a).endsWith("0")) {
                return "Even";
            }
            else {
                return "Odd";
            }
        }

        // Here we will land if
        // it does not ends with 0
        else {
            return "Zero";
        }
    }
}
