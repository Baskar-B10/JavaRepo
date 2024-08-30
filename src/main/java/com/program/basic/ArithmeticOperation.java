package com.program.basic;

public class ArithmeticOperation {

    public static void main(String[] args)
    {
        String x = "011011", y = "1010111";

        System.out.println("Add Binary numbers: "+addBinary(x, y));

        // f is to ensures that numbers are float DATA TYPE
        float f1 = 1.5f;
        float f2 = 2.0f;
        System.out.println("The product is: " + MultiplyFloat(f1,f2));
        float P = 10000, R = 5, T = 5;
        simpleInterest(P,R,T);
        double principal = 10000, rate = 10.25, time = 5;
        compoundInterest(principal,rate,time);

        int length = 10;
        int breadth = 20;
        perimeter(length,breadth);

    }
static float MultiplyFloat(float f1, float f2){
    // to store the multiplied value
    return  f1 * f2;
}
    static String addBinary(String x, String y)
    {

        int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)

        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)

        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum

        String result = Integer.toBinaryString(sum);
        // Converting that resultant decimal into binary
        // string

        return result;
    }

    public static void simpleInterest( float P ,float R ,float T)
    {
        // We can change values here for
        // different inputs


        // Calculate simple interest
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }

    public static void compoundInterest( double principal , double rate ,double time)
    {


        /* Calculate compound interest */
        double CI = principal *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is "+ CI);
    }

    static void perimeter(int length, int breadth)
    {
        // Calculate the 'perimeter' using the formula
        int perimeter = 2 * (length + breadth);

        System.out.println("The perimeter of the given rectangle of length "
                + length + " and breadth " + breadth + " = "
                + perimeter);
    }

}
