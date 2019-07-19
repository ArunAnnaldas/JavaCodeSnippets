package collections.hashing;

import java.util.concurrent.ConcurrentHashMap;

public class _5_ConcurrentHashMap {

	/**
	 * With the help of ConcurretHashMap(Similar to Hashtable, Synchronized, but
	 * faster as multiple locks are used) ConcurrentHashMap only locks certain
	 * portion of Map.
	 * 
	 * Hashtable is synchronized but ConcurrentHashMap provides better concurrency
	 * by only locking portion of map determined by concurrency level.
	 * 
	 * By default ConcurretHashMap simultaneously allows 16 threads to read and
	 * write from Map without any external synchronization
	 * 
	 * In multi-threaded Java application synchronized collection classes like
	 * Hashtable and Vector quickly becomes the bottleneck; to address scalability
	 * JDK 1.5 introduces some good concurrent collections which are highly
	 * efficient for high volume, low latency system electronic trading systems
	 * 
	 * ConcurrentHashMap does not allow null keys or null values
	 * 
	 * When to use it???? 
	 * ConcurrentHashMap is best suited when you have multiple
	 * readers and few writers. If writers outnumber reader, or writer is equal to
	 * reader, than performance of ConcurrentHashMap effectively reduces to
	 * synchronized map or Hashtable.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");

		// Printing the ConcurrentHashMap
		System.out.println("ConcurentHashMap: " + m);

		// Adding Hello at 101 key
		// This is already present in ConcurrentHashMap object
		// Therefore its better to use putIfAbsent for such cases
		m.putIfAbsent(101, "Hello");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);

		// Trying to remove entry for 101 key
		// since it is present
		m.remove(101, "Geeks");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);

		// replacing the value for key 101
		// from "Hello" to "For"
		m.replace(100, "Hello", "For");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);
	}
}
