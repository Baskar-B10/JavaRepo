package com.learnings.localDateTime;// Java Program to demonstrate
// instant() method of Clock class

import java.time.*;

// create class
public class instantMethodDemo {

	// LongToIntFunctionApplyAsInt method
	public static void main(String[] args)
	{

		// create Clock Object
		Clock clock = Clock.systemDefaultZone();

		// get Instant Object of Clock
		// object using instant() method
		Instant instantObj = clock.instant();

		// print details of Instant Object
		System.out.println("Instant for class " + clock
						+ " is " + instantObj);


		// create a Zone Id for Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");

		// create Clock Object by passing zoneID
		Clock clock1 = Clock.system(zoneId);

		// get Instant Object of Clock
		// object using instant() method
		Instant instantObj1 = clock1.instant();

		// get ZonedDateTime object from
		// instantObj to get zoned date time
		ZonedDateTime time = instantObj1.atZone(clock.getZone());

		// print details of Instant Object
		System.out.println("Instant for class " + clock
				+ " is " + time.toString());
	}
}
