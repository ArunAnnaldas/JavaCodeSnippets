package collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * The subList method returns a list therefore to store the sublist in another
 * ArrayList we must need to type cast the returned value in same way as I did
 * in the below example. On the other side if we are storing the returned
 * sublist into a list then there is no need to type cast (Refer the example).
 * 
 * @author aannaldas
 *
 */
public class _5_SublistExample {

	public static void main(String a[]) {
		ArrayList<String> al = new ArrayList<String>();

		// Addition of elements in ArrayList
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");

		System.out.println("Original ArrayList Content: " + al);

		// Sublist to ArrayList
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
		System.out.println("SubList stored in ArrayList: " + al2);

		// Sublist to List
		List<String> list = al.subList(1, 4);
		System.out.println("SubList stored in List: " + list);
	}
}
