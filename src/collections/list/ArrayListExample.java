package collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListExample {

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

		initUsingArrays_anonymousInnerClass();

		/**
		 * Collections.ncopies method can be used when we need to initialize the
		 * ArrayList with the same value for all of its elements. Syntax: count is
		 * number of elements and element is the item value
		 */
		initUsingArrays_collections_ncopies();

	}

	private static void initUsingArrays_normal() {

		ArrayListExample<String> alist = new ArrayListExample<String>();
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

		// *************************************************
		// ********** ITERATING THROUGH ARRAYLIST **********
		// *************************************************

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < alist.size(); counter++) {
			System.out.println(alist.get(counter));
		}

		// Iterating using Advanced for loop
		for (String str : alist)
			System.out.println(str);

		// Iterating using while loop
		System.out.println("while loop");
		int count = 0;
		while (alist.size() > count) {
			System.out.println(alist.get(count));
			count++;
		}

		// Iterating using Iterator
		Iterator itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// iterate arraylist elements using Enumeration interface
		Enumeration<String> e = Collections.enumeration(alist);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// *************************************************
		// ********** SORTING AN ARRAYLIST **********
		// *************************************************

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : alist) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(alist); // ==========>>>>>>>>>>>>>>

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : alist) {
			System.out.println(counter);
		}

		/* Sorting in decreasing order */
		Collections.sort(alist, Collections.reverseOrder()); // ==========>>>>>>>>>>>>>>

		/* Sorted List in reverse order */
		System.out.println("ArrayList in descending order:");
		for (String str : alist) {
			System.out.println(str);
		}

		/*
		 * the reverse order sorting can also be done as following – This way the list
		 * will be sorted in ascending order first and then it will be reversed.
		 */
		Collections.sort(alist);// ==========>>>>>>>>>>>>>>
		Collections.reverse(alist);// ==========>>>>>>>>>>>>>>


	}

	private static void initUsingArrays_collections_ncopies() {
		ArrayListExample<String> alist = new ArrayListExample<String>(Collections.nCopies(15, "Arun"));

		System.out.println(alist);

	}

	private static void initUsingArrays_anonymousInnerClass() {
		ArrayListExample<String> alist = new ArrayListExample<String>() {
			{
				add("Mumbai");
				add("Delhi");
				add("Agra");
			}
		};

		System.out.println("Elements are " + alist);

	}

	private static void initUsingArrays_asList() {
		ArrayListExample<String> alist = new ArrayListExample<String>(Arrays.asList("Jiggy", "Mirchi", "Mime"));

		System.out.println("Elements are " + alist);

		ArrayListExample<String> alist1 = new ArrayListExample<String>();

	}

}
