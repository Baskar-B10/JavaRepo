package com.testSkills;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopConcepts {

    public static void main(String[] args) {
        List<Integer> colors = new ArrayList<>();
        colors.add(1);
        colors.add(2);
        colors.add(3);
        colors.add(4);

        Iterator<Integer> iterator = colors.iterator();
        while (iterator.hasNext()) {
            Integer color = iterator.next();
            if (color.equals(3)) {
                colors.remove(color);
            }
        }

        System.out.println(colors); // Output: [Blue, Green]


        String[] array = {"a", "b", "c", "d"};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

}