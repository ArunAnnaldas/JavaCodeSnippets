package collections.list.arrayList;

import java.util.ArrayList;

public class _7_EnsureCapacityExample {

	/*
	 * 
	 * The ensureCapacity() method of java.util.ArrayList class increases the
	 * capacity of this ArrayList instance, if necessary, to ensure that it can hold
	 * at least the number of elements specified by the minimum capacity argument.
	 * 
	 */
	public static void main(String args[]) {
		// ArrayList with Capacity 4
		ArrayList<String> al = new ArrayList<String>(4);
		// Added 4 elements
		al.add("Hi");
		al.add("Hello");
		al.add("Bye");
		al.add("GM");

		// Increase capacity to 5
		al.ensureCapacity(5);

		al.add("GE");
		// let us print all the elements available in list
		for (String temp : al) {
			System.out.println(temp);
		}
	}
}