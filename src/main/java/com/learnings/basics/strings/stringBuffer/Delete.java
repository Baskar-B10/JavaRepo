package com.learnings.basics.strings.stringBuffer;

class Delete {
    public static void main(String args[]) {
      
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);

        StringBuffer s = new StringBuffer("GeeksforGeeks");
        s.delete(0, 5);

        // Returns forGeeks
        System.out.println(s);

        s.deleteCharAt(7);

        // Returns forGeek
        System.out.println(s);
    }
}