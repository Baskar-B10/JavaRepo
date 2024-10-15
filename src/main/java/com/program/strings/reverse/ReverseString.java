package com.program.strings.reverse;// java program to reverse a word

class ReverseString {
    public static void main (String[] args) {
      
        String str= "Geeks", nstr="";
        char ch;
      
      System.out.print("Original word: ");
      System.out.println("Geeks"); //YearMonthDemo word
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word by Concat front : "+ nstr);


        String input = "GeeksforGeeks";

        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println("Reversed word by get bytes : "+new String(result));


        String input1 = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input1.toCharArray();
        System.out.println("Reversed word ny To chars at : ");
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}

//Contributed by Tiyasa
