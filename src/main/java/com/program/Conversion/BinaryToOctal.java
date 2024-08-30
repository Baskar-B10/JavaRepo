package com.program.Conversion;

public class BinaryToOctal {

    // method to convert binary to decimal
    int binaryToDecimal(long binary)
    {
        // variable to store the decimal number
        int decimalNumber = 0, i = 0;

        // loop to extract the digits of the
        // binary number
        while (binary > 0) {

            // multiplying each digit of binary
            // with increasing powers of 2 towards
            // left
            decimalNumber
                    += Math.pow(2, i++) * (binary % 10);

            // dividing the binary by 10
            // to remove the last digit
            binary /= 10;
        }

        // returning the converted decimal number
        return decimalNumber;
    }

    // function to convert decimal to octal
    int decimalToOctalUsingFunction(long binary)
    {
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int decimalNumber = binaryToDecimal(binary);

        // using the toOctalString() to convert
        // Integer to String of Octal Number
        String octalString
                = Integer.toOctalString(decimalNumber);

        // converting the String of octal number
        // to an Integer
        int octalNumber = Integer.parseInt(octalString);

        // returning the octal number
        return octalNumber;
    }

    int decimalToOctal(long binary)
    {
        // variable to store the octal number
        int octalNumber = 0, i = 0;

        // variable to store the output
        // returned by the binaryToDecimal()
        int decimalNumber = binaryToDecimal(binary);

        // loop to convert decimal to octal
        while (decimalNumber != 0) {

            // extracting the remainder on
            // multiplying by 8 and
            // dividing that with increasing
            // powers of 10
            octalNumber += (decimalNumber % 8)
                    * ((int)Math.pow(10, i++));

            // removing the last digit by
            // dividing by 8
            decimalNumber /= 8;
        }

        // returning the converted octal number
        return octalNumber;
    }


    // Driver Code
    public static void main(String[] args)
    {
        // instantiating the class

        BinaryToOctal octalAndBinary= new BinaryToOctal();
        // calling and printing the decimalToOCtal
        // method
        System.out.println("octal number:"
                + octalAndBinary.decimalToOctal(100100));
        System.out.println("octal number:"
                + octalAndBinary.decimalToOctalUsingFunction(10101010));

    }
}
