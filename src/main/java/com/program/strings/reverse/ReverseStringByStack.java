package com.program.strings.reverse;

import java.util.*;

class ReverseStringByStack {
    //Time Complexity : O(N) N is length of string
    //
    //Auxiliary Space: O(N) for stack
    public static void main(String[] args) {
       
        String s="Geeks For Geeks";
        
        //initializing a stack of type char
        Stack<Character> stack=new Stack<>();
        
        for(char c:s.toCharArray())
        {
            //pushing all the characters
            stack.push(c);
        }
        
        String temp="";
        
        while(!stack.isEmpty())
        {
            //popping all the chars and appending to temp
            temp+=stack.pop();
        }
        
        System.out.println("Reversed string is : "+temp);
        
    }
}

//This code is contributed by aeroabrar_31
