package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class _6_HashSet {

	/**
	 * With the help of HashSet (Similar to HashMap, but maintains only keys, not
	 * pair)
	 * 
	 * Since HashSet uses HashMap internally it provides constant time performance
	 * for operations like add, remove, contains and size give HashMap has
	 * distributed elements properly among the buckets
	 * 
	 * When you create an object of HashSet in Java, it internally create instance
	 * of backup Map with default initial capacity 16 and default load factor 0.75
	 * as shown below :
	 * 
	 * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
	 * default initial capacity (16) and load factor (0.75).
	 * 
	 * public HashSet() { map = new HashMap<>(); }
	 * 
	 * =========================================================================
	 * 
	 * How Object is stored in HashSet
	 * ==========================================================================
	 * 
	 * As you can see below, a call to add(Object) is delegate to put(Key, Value)
	 * internally, where Key is the object you have passed and value is another
	 * object, called PRESENT, which is a constant in java.util.HashSet as shown
	 * below :
	 * 
	 * private transient HashMap<E,Object> map;
	 * 
	 * // Dummy value to associate with an Object in the backing Map private static
	 * final Object PRESENT = new Object();
	 * 
	 * public boolean add(E e) { return map.put(e, PRESENT)==null; }
	 * 
	 * Since PRESENT is a constant, for all keys we have same value in backup
	 * HashMap called map.
	 * 
	 * ==========================================================================
	 * How Object is retrieved from HashSet
	 * ==========================================================================
	 * 
	 * public Iterator<E> iterator() { return map.keySet().iterator(); }
	 * 
	 * 
	 * ==========================================================================
	 * 
	 * Iterator of HashSet is fail-fast and throws ConcurrentModificationException
	 * if HashSet instance is modified concurrently during iteration by using any
	 * method other than remove() method of iterator class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet usind add()
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India"); // adding duplicate elements

		// Displaying the HashSet
		System.out.println(h);

		// Checking if India is present or not
		System.out.println("\nHashSet contains India or not:" + h.contains("India"));

		// Removing items from HashSet using remove()
		h.remove("Australia");

		// Printing the HashSet
		System.out.println("\nList after removing Australia:" + h);

		// Iterating over hash set items
		System.out.println("\nIterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
