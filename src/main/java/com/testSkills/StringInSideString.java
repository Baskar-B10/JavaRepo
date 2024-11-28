package com.testSkills;

public class StringInSideString {



    public static void main(String[] args) {
        String s1="hellohellohello";
        String s2="el";

        String[] strArray=s1.split("");
        String conString="";
        int count=0;
        for(String s: strArray){
            conString=conString+s;

            if(conString.contains(s2)){
                conString="";
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
