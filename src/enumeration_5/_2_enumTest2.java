package enumeration_5;

/**
 * Enumeration means a list of named constant.
 * 
 * Each enumeration constant is public, static and final by default
 * 
 * Java enums implicitly extend the java.lang.Enum class. Hence, they cannot
 * extend any class
 * 
 * Java enums implicitly implement the java.lang.Comparable and the
 * java.io.Serializable interfaces.
 * 
 * Even though enumeration defines a class type and have constructors, instance
 * variables & methods, you do not instantiate an enum using new.
 * 
 * Enumeration variables are used and declared in much a same way as you do a
 * primitive variable
 *
 * In fact, an enum that is declared: * public enum MyConstants{ ... } is
 * implemented at the JVM as: * public static class Enum<MyConstants> { ... }
 * 
 * The rules for declaring enum classes is thus the same as for declaring
 * classes. A .java file may have only one public class.
 * 
 * You can therefore declare only one public enum in a .java file. You may
 * declare any number of package-private enums.
 *
 */
enum Restaurants {
	dominos, kfc, pizzahut, paninos, burgerking
}

public class _2_enumTest2 {
	public static void main(String args[]) {
		Restaurants r;
		System.out.println("All constants of enum type Restaurants are:");
		Restaurants rArray[] = Restaurants.values(); // returns an array of constants of type Restaurants
		for (Restaurants a : rArray) // using foreach loop
			System.out.println(a);

		r = Restaurants.valueOf("dominos");
		System.out.println("I AM " + r);
	}
}
