package com.testSkills;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class SortBySize {
    public static void main(String[] args) {
        // System.out.print("main method");

        //16, 62, 13, 44, 5, 46, 27, 18, 19, 10

        List<Integer> num = new ArrayList<Integer>();
        num.add(16);
        num.add(62);
        num.add(13);
        num.add(44);
        num.add(5);
        num.add(46);
        num.add(27);
        num.add(18);
        num.add(19);
        num.add(10);
        int ouput=0;
        for (Integer i : num) {

            if(i %2==0) {
                ouput = ouput + i;  }}

        // System.out.println(ouput);
        //"banana", "apple", "orange", "grape", "kiwi"

        List<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("grape");
        list.add("kiwi");

        Map<Integer, List<String>> map = new LinkedHashMap<Integer, List<String>>();

        for (String string : list) {
            int len= string.length();
            List<String> array=new ArrayList<String>();
            if(!map.containsKey(len)) {
                array.add(string);
                map.put(len, array);

            }else {
                array= map.get(len);
                array.add(string);
                map.put(len, array);
            }



        }
        for (Map.Entry m : map.entrySet()) {

            System.out.print(m.getKey() +" " + m.getValue());

        }

    }
}
