package collections.list.arrayList.synchronize;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {

	/**
	 * CopyOnWriteArrayList is a thread-safe variant of ArrayList.
	 * 
	 * @param a
	 */

	public static void main(String a[]) {
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		al.add("Pen");
		al.add("NoteBook");
		al.add("Ink");

		System.out.println("Displaying synchronized ArrayList Elements:");
		// Synchronized block is not required in this method
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}
