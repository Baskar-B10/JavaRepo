package com.learnings.lambadaExpression;
import java.util.HashMap;
import java.util.Map;
public class MultipleParameter {
     public static void main(String[] args) {
        Map<String,String> stringStringMap= new HashMap<String,String>();
        stringStringMap.put("Baskar","29");
        stringStringMap.put("Madhu","26");
        stringStringMap.forEach((s, s2) -> System.out.println("name : " + s +" and age: "+ s2));
        stringStringMap.forEach((s, s2) ->
        {
         System.out.println(s + s2);
            if(s.contains("a"))
                System.out.println("a exist");
             try{
                Integer.parseInt(s2);
               System.out.println(s2+" is Number");
            }catch (NumberFormatException numberFormatException){
                System.out.println(s2+" is not Number");
            }
        });
     }
}
