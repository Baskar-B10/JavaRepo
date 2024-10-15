package com.testSkills;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        Map<String,String> mapList = new HashMap<String,String>();
        mapList.put("A","1");
        mapList.put("A","3");
        mapList.put(null,"3");

        mapList.put("B",null);
        mapList.put("B","7");

        for (Map.Entry map: mapList.entrySet()){
           System.out.println(map.getKey()+" "+ map.getValue());
            System.out.println();
        }

        Set<String> stringSet= new HashSet<String>();
        stringSet.add("B");
        stringSet.add("B");

        for (String val: stringSet){
            System.out.println(stringSet);
        }


    }

}
