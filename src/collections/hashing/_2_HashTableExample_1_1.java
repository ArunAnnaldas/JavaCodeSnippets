package collections.hashing;

import java.util.Hashtable;

public class _2_HashTableExample_1_1 {

	/**
	 * Implement Hashing using HashTable (A synchronized implementation of hashing)
	 * 
	 * All methods of Hashtable are synchronized which makes them quite slow due to
	 * contention if a number of thread increases
	 * 
	 * Hashtable is a legacy class from JDK 1.1 itself, which uses synchronized
	 * methods to achieve thread-safety
	 * 
	 * The only difference between Hashtable and Synchronized Map(concurrentHashMap)
	 * is that later is not a legacy and you can wrap any Map to create it's
	 * synchronized version by using Collections.synchronizedMap() method
	 * 
	 * once the size of Hashtable becomes considerable large performance degrade
	 * because for iteration it has to be locked for a longer duration
	 */
	public static void main(String args[]) {

		// Create a HashTable to store
		// String values corresponding to integer keys
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		// Input the values
		hm.put(1, "Geeks");
		hm.put(12, "forGeeks");
		hm.put(15, "A computer");
		hm.put(3, "Portal");

		// Printing the Hashtable
		System.out.println(hm);
	}
}
