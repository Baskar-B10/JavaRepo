package com.learnings.streamAPI.operations.terminal.forEach;

import java.util.ArrayList;
import java.util.List;

public class LoopVsStreamForEach {


    public static void main(String[] args) throws Exception{
        //Lambda operator is not used in loop for each
        //It can be used for all collections and arrays
        loopForEach();
        //The return statements work within the loop
        String[] arr1 = { "Geeks", "For", "Geeks" };
        String secelt = frechlop(arr1);
        System.out.println(secelt);
        ///Lambda operator is used: StreamDemo
        //Only used to iterate collections
        streamForEach();
        //Return statements don’t work within this loop
        // but the function calls are very easy to call:
        List<String> arr2 = new ArrayList<String>();
        arr2.add("Geeks");
        arr2.add("For");
        arr2.add("Geeks");
        String f = second(arr2);
        System.out.println(f);

        //Works on multithreading concept: Parrallel StreamDemo
        parallelStreamForEach();
    }
    public static void loopForEach()
    {
        String[] arr = { "1", "2", "3" };
        int count = 0;

        String[] arr1 = { "Geeks", "For", "Geeks" };

        for (String str : arr) {
            System.out.print(arr1[count++]);
        }
    }

    public static String frechlop(String[] geek)
    {
        int count = 0;
        for (String var : geek) {
            if (count == 1)
                return var;
            count++;
        }
        return "";
    }
    public static void streamForEach() throws Exception
    {

        List<String> arr1 = new ArrayList<String>();
        int count = 0;
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");
        arr1.stream().forEach(s -> {
            // this will cause an error
            //count++;
             // print all elements
            System.out.print(s);
        });
    }

    static String second(List<String> list)
    {list.stream().forEach(
                        s -> {
                            // The next line will throw error
                            // as no return allowed
                            // if(s=="For")return s;
                            });
        return "null";
    }
    public static void parallelStreamForEach()
            throws Exception
    {

        List<String> arr1
                = new ArrayList<String>();
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");

        arr1
                .parallelStream()
                .forEach(
                        s -> {
                            System.out.print(s);
                        });
    }
}
