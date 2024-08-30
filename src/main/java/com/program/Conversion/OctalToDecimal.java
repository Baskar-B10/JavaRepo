package com.program.Conversion;

public class OctalToDecimal{

    public static void main(String[] args) {
        // octal value
        String onum  = "157";
        usingParseInt(onum);
        int a = 167;
        usingCustomFunc(a);

    }
    public static void usingParseInt(String onum)
    {// octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(onum, 8);

        System.out.println(
                "Decimal equivalent of Octal value 157 is: "
                        + num);
    }

    public static void usingCustomFunc(int a)
    {

        // Initialize result variable to 0.
        int result = 0;

        // Take a copy of input
        int copy_a = a;

        for (int i = 0; copy_a > 0; i++) {

            // Take the last digit
            int temp = copy_a % 10;

            // Appropriate power on 8 suitable to
            // its position.
            double p = Math.pow(8, i);

            // Multiply the digits to the  into the Input
            // and
            //  then add it to result
            result += (temp * p);
            copy_a = copy_a / 10;
        }

        System.out.print("Decimal of Octal Number (" + a
                + ") : " + result);
    }
}
