package collections.list;

import java.util.Stack;
import java.util.Vector;

public class _1_1_Vector {

	/**
	 * ===========================================================================
	 * Common property of Vector and ArrayList in Java
	 * ===========================================================================
	 * 
	 * 1) Both Vector and ArrayList are derived from AbstractList and implements
	 * List interface, which means both of them are ordered collection and allows
	 * duplicates.
	 * 
	 * 2) Another similarity between Vector vs ArrayList is that both are index
	 * based Collection and you can use get(index) method to retrieve objects from
	 * Vector and ArrayList.
	 * 
	 * ===========================================================================
	 * Differences
	 * ===========================================================================
	 * 
	 * 1) Vector is synchronized and thread-safe while ArrayList is neither
	 * Synchronized nor thread-safe.
	 * 
	 * 2) Since Vector is synchronized, its slow and ArrayList is not synchronized
	 * its faster than Vector.
	 * 
	 * 3) Vector is a legacy class and initially it was not part of Java Collection
	 * Framework. From Java 1.4 Vector was retro fitted to implement List interface
	 * and become part of Collection Framework.
	 * 
	 */

	public static void main(String[] args) {

		
	}

}
