package com.testSkills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetMapFromLIst {

    public static void main(String[] args) {


        Map<String,String> numList = new HashMap<String,String>();

        numList.put("1","101");
        numList.put("2","102");
        numList.put("3","103");
        numList.put("4","104");

        List<String> list= new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
     System.out.println(numList.entrySet().stream().filter( enty -> list.contains(enty.getKey()))
                //.map(Map.Entry::getKey)
                .collect(Collectors.toList()));

    }
}
