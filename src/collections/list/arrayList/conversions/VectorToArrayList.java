package collections.list.arrayList.conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorToArrayList {
	public static void main(String[] args) {

		// Creating a Vector of String elements
		Vector<String> vector = new Vector<String>();

		// Populate Vector
		vector.add("Rahul");
		vector.add("Steve");
		vector.add("Jude");
		vector.add("Locke");
		vector.add("Mike");
		vector.add("Robert");

		// Displaying Vector elements
		for (String str : vector) {
			System.out.println(str);
		}

		// Converting Vector to ArrayList
		List<String> arraylist = new ArrayList<String>(vector);

		// Displaying ArrayList Elements
		System.out.println("\nArrayList Elements :");
		for (String s : arraylist) {
			System.out.println(s);
		}
	}
}
