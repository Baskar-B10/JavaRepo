package com.practice.string;

//User function Template for Java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ReverseProblem
{
    public static void main(String[] args) {

        System.out.println(reverseStringss("Baskar"));
        System.out.println(reverseDigit(753665));
        System.out.println(reverseString("Baskar"));
        System.out.println( reverseStrings("Baskar"));

        //Geeks for geeks
        StringBuilder Sb = new StringBuilder("Baskar").reverse();
        String Result=Sb.toString();
        System.out.println(Result);

    }
    public static long reverseDigit(long n)
{
    // Code here
    long original =n;
    long reverse =0;
    while(original!=0){
        long digit= original% 10;
        reverse =reverse *10 + digit;
        original=original/10;
    }
    return reverse;
}

    public static String reverseString(String s)
    {
        // Code here
        String reverse=Arrays.stream(s.split(""))
               .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
                   Collections.reverse(list);
                   return list.stream();
               })).map(String::valueOf).collect(Collectors.joining()) ;
        return reverse;
    }

    public static String reverseStrings(String s)
    {
        // Code here
        List<String> reverseList=Arrays.asList(s.split(""));
        //System.out.println(reverseList);
        Collections.reverse(reverseList);

        String reverse= reverseList.stream().collect(Collectors.joining());
        return reverse;
    }

    public static String reverseStringss(String s){
        List<String> reverseList=Arrays.asList(s.split(""));

        // Collections.reverse(reverseList);
        String reverse="";
        System.out.println(reverseList.size());
        int n =reverseList.size();
        for(int j=n-1; j>=0; j--){
            System.out.println(j+reverseList.get(j));
            reverse=reverse+reverseList.get(j);
        }
        return reverse;
    }

}