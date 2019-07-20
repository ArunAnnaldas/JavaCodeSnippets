package collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class _1_ArrayList {

	/**
	 * ArrayList is a resizable-array implementation of the List interface
	 * 
	 * ArrayList can dynamically grow and shrink after addition and removal of
	 * elements
	 * 
	 * 
	 * 
	 */

	public static void main(String args[]) {

		initUsingArrays_normal();
		
		initUsingArrays_asList();

	}

	private static void initUsingArrays_asList() {
		ArrayList<String> alist = new ArrayList<String>(
				Arrays.asList("Jiggy","Mirchi","Mime"));
		
		System.out.println("Elements are " + alist);
		
	}

	private static void initUsingArrays_normal() {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");

		// displaying elements
		System.out.println(alist);

		// Removing "Steve" and "Angela"
		alist.remove("Steve");
		alist.remove("Angela");

		// displaying elements
		System.out.println(alist);

		// Removing 3rd element
		alist.remove(2);

		// displaying elements
		System.out.println(alist);

		// iterating ArrayList
		for (String str : alist)
			System.out.println(str);

	}
}
