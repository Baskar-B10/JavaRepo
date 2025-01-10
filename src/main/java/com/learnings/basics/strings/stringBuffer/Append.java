package com.learnings.basics.strings.stringBuffer;

class Append {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);

        StringBuffer s = new StringBuffer("Geeksfor");

        // Usage of append() method
        s.append("Geeks");

        // Returns GeeksforGeeks
        System.out.println(s);

        s.append(1);
        // Returns GeeksforGeeks1
        System.out.println(s);
    }
}