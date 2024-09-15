package com.learnings.localDateTime;

// java program to create a new
// ZonedDateTime using parse() method
import java.time.*;

public class ZoneDateDemo {
 
    public static void main(String[] args)
    {
        String text
            = "2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";
        // creating a new ZonedDateTime object
        ZonedDateTime zone = ZonedDateTime.parse(text);
        System.out.println(zone);


        // printing the zone of this zonedDateTime object
        System.out.println(zone.getZone());
        // printing original value of
        // this ZonedDateTime object
        System.out.println(zone);
        // printing value of this ZonedDateTime
        // object after subtracting two months
        System.out.println(zone.minus(Period.ofMonths(2)));
        // printing value of this ZonedDateTime
        // object after adding two months
        System.out.println(zone.plus(Period.ofMonths(2)));


        // getting current date
        LocalDate date = LocalDate.now();

        // getting current time
        LocalTime time = LocalTime.now();

        // getting system default zone id
        ZoneId zoneId = ZoneId.systemDefault();

        // creating a new ZonedDateTime object
        ZonedDateTime zonedatetime
                = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zonedatetime);
    }


}