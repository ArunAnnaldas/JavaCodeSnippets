package enumeration_5;

import java.lang.reflect.Type;

/**
 * Enumeration means a list of named constant.
 * 
 * Each enumeration constant is public, static and final by default
 * 
 * Even though enumeration defines a class type and have constructors, you do
 * not instantiate an enum using new.
 * 
 * Enumeration variables are used and declared in much a same way as you do a
 * primitive variable
 * 
 * These are public, static and final by default.
 *
 */
enum WeekDays {
	sun, mon, tues, wed, thurs, fri, sat
}

public class _1_enumTest {

	public static void main(String[] args) {

		WeekDays wk; // wk is an enumeration variable of type WeekDays
		wk = WeekDays.sun; // wk can be assigned only the constants defined under enum type Weekdays
		System.out.println("Today is " + wk);
	}
}
