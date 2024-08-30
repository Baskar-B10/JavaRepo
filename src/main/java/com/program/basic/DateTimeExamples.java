package com.program.basic;

import java.time.Year;

public class DateTimeExamples {

    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        Year checkyear = Year.of(year);

        is_leap_year = checkyear.isLeap();

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

}
