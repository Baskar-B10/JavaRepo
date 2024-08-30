package com.program.Conversion;

public class HexaDecimalToDecimal {

    static int hexadecimalToDecimal(String hexVal)
    {
        // Storing the length of the
        int len = hexVal.length();

        // Initializing base value to 1, i.e 16^0
        int base = 1;

        // Initially declaring and initializing
        // decimal value to zero
        int dec_val = 0;

        // Extracting characters as
        // digits from last character

        for (int i = len - 1; i >= 0; i--) {

            // Condition check
            // Case 1
            // If character lies in '0'-'9', converting
            // it to integral 0-9 by subtracting 48 from
            // ASCII value
            if (hexVal.charAt(i) >= '0'
                    && hexVal.charAt(i) <= '9') {
                dec_val += (hexVal.charAt(i) - 48) * base;

                // Incrementing base by power
                base = base * 16;
            }

            // Case 2
            // if case 1 is bypassed

            // Now, if character lies in 'PublicMethods'-'F' ,
            // converting it to integral 10 - 15 by
            // subtracting 55 from ASCII value
            else if (hexVal.charAt(i) >= 'A'
                    && hexVal.charAt(i) <= 'F') {
                dec_val += (hexVal.charAt(i) - 55) * base;

                // Incrementing base by power
                base = base * 16;
            }
        }

        // Returning the decimal value
        return dec_val;
    }

    private static int hexToDec(String hex)
    {
        int len = hex.length();
        int dec = 0;
        for (int i = 0; i < len; i++) {
            char c = hex.charAt(i);
            int digit = Character.digit(c, 16);
            dec = dec * 16 + digit;
        }
        return dec;
    }

    public static void main (String[] args)
    {
        // Custom input hexadecimal number to be
        // converted into decimal number
        String hexNum = "1A";

        // Calling the above method to convert and
        // alongside printing the hexadecimal number
        System.out.println(hexadecimalToDecimal(hexNum));

        String hex1 = "1AB";

        int dec1 = hexToDec(hex1);

        System.out.println(hex1 + " in decimal is " + dec1);

    }
}
