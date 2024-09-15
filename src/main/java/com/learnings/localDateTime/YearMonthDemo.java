package com.learnings.localDateTime;// plus() Method implementation
import java.time.*; 
public class YearMonthDemo {
	public static void main(String[] args) 
	{ 
		YearMonth obj1 = YearMonth.now(); 

		// plus(Period.ofYears(int)) will add 
		// no.of years to the existing year 
		YearMonth obj2 = obj1.plus(Period.ofYears(0)); 
		System.out.println(obj2);
		YearMonth obj3 = YearMonth.now();

		//.minus(Period.ofYears(int)) will subtract
		// no. ofyears from the existing year
		YearMonth obj4 = obj3.minus(Period.ofYears(3));
		System.out.println(obj4);
	} 
}
