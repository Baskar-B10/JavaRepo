package com.learnings.lambadaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class RemoveNullsUsingPredicate {
     public static void main(String[] args) {
        // Create a list with null values
        List<String> l = new ArrayList<>(
                Arrays.asList("You",
                        null,
                        "having",
                        null,
                        "A computer portal"));
      // Print the list
        System.out.println("List with null values: " + l);
        Predicate<String> isNullPredicate = s -> (null!=s);
         l=removeNullElements(l,isNullPredicate);
         l=removeElements(l,isNullPredicate);
        l.forEach(System.out::println);
    }

    public static <T>List removeNullElements (List<T>  list, Predicate<T> predicate){
        // Removing nulls using Java StreamDemo
        // using Predicate condition in lambda expression
        list = list.stream().filter(predicate).collect(Collectors.toList());
        return list;
    }

    public static <T> List<T>
    removeElements(List<T> l, Predicate<T> p)
    {

        // Removing nulls using Java StreamDemo
        // using Predicate condition in removeIf()
        l.removeIf(x -> p.test(x));

        // Return the list
        return l;
    }
}
