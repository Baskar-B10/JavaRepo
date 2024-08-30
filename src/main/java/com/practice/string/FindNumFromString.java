package com.practice.string;

import java.util.Arrays;
import java.util.OptionalLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.core.io.buffer.DataBufferUtils.matcher;

public class FindNumFromString {
    public static void main(String[] args) {
        System.out.println( findMaximumNumber("tef 67 834 98 0763"));
    }
   public static  long findMaximumNumber(String sentence){


       long output =-1;
       //String[] data =  sentence.split(" ");
       Pattern pattern = Pattern.compile("\\d+");
      OptionalLong max=Arrays.stream(sentence.split(" "))
               .filter(s -> pattern.matcher(s).matches() && !s.contains("9"))
               .mapToLong(Long::parseLong).max();
       if(max.isPresent()){
           output = max.getAsLong();
       }

       return output;
   }

   }




