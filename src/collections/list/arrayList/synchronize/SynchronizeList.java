package collections.list.arrayList.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeList {

	/**
	 * The important point to note here is that iterator should be in synchronized
	 * block in this type of synchronization as shown in the below example.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		List<String> syncal = Collections.synchronizedList(new ArrayList<String>());

		// Adding elements to synchronized ArrayList
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized (syncal) {
			Iterator<String> iterator = syncal.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}
}
