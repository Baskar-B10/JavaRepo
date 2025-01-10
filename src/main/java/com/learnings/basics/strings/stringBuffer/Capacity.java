package com.learnings.basics.strings.stringBuffer;

class Capacity {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
      
          // default 16
        System.out.println(sb.capacity()); 
        sb.append("Hello");
      
          // now 16
        System.out.println(sb.capacity()); 
        sb.append("java is my favourite language");
        
          // (oldcapacity*2)+2
          System.out.println(sb.capacity());
    }
}