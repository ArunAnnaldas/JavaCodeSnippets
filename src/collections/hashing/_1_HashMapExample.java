package collections.hashing;

import java.util.HashMap;

public class _1_HashMapExample {

	/**
	 * Earlier it was used to initialized by default size of 16, but now (Since JDK
	 * 7 update 40) its initialized by empty table.
	 * 
	 * Since Java 8, The default initial capacity - MUST be a power of two.
	 * 
	 * HashMap does not maintain any order neither based on key nor on basis of
	 * value, If we want the keys to be maintained in a sorted order, we need to use
	 * TreeMap. Complexity: get/put/containsKey() operations are O(1) in average
	 * case but we can’t guarantee that since it all depends on how much time does
	 * it take to compute the hash.
	 * 
	 * In Web Applications username is stored as a key and user data is stored as a
	 * value in the HashMap, for faster retrieval of user data corresponding to a
	 * username.
	 * 
	 * HashMap which is non-synchronized by nature can be synchronized by applying a
	 * wrapper using synchronized Map.
	 * 
	 * Synchronized HashMap allows one null key.
	 * 
	 * When we pass both key and value to put() method to store on HashMap, it uses
	 * key object hashcode() method to calculate hashcode and then by applying
	 * hashing on that hashcode it identifies bucket location for storing value
	 * object.
	 * 
	 * 
	 * 1) How does get(Key key) method works internally in HashMap, and Hashtable in
	 * Java? Here are steps, which happens, when you call get() method with key
	 * object to retrieve corresponding value from hash based collection
	 * 
	 * a) Key.hashCode() method is used to find the bucket location in backing
	 * array. (Remember HashMap is backed by array in Java) Though hashcode() is not
	 * used directly, but they are passed to internal hash() function.
	 * 
	 * b) In backing array or better known as the bucket, key and values are stored
	 * in the form of a nested class called Entry. If there is only one Entry at
	 * bucket location, then the value from that entry is returned.
	 * 
	 * This has also changed from Java 8, where after a threshold is crossed then a
	 * binary tree is used instead of linked list to lift the worst case performance
	 * from O(n) to O(logN).
	 * 
	 * if we need to retrieve value object in collision situation, following steps
	 * will be followed :
	 * 
	 * 1) Call hashCode() method of the key to finding bucket location.
	 * 
	 * 2) Traverse thought linked list, comparing keys in each entries using
	 * keys.equals() until it returns true.
	 * 
	 * So, we use equals() method of a key object to find correct entry and then
	 * return value from that. Remember key.equals() method.
	 * 
	 * Since a poor hash function e.g. which always return location of same bucket,
	 * can turn a HashMap into linked list, i.e. converting get() method to perform
	 * in O(n) instead of O(1) and someone can take advantage of this fact, Java now
	 * internally replace linked list to a binary true once certain threshold is
	 * breached. This ensures performance or order O(log(n)) even in the worst case
	 * where a hash function is not distributing keys properly.
	 *
	 * 
	 * @param arr
	 */

	static void createHashMap(int arr[]) {
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {

			// Get if the element is present
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			// Insert the element
			if (hmap.get(arr[i]) == null) {
				hmap.put(arr[i], 1);
			}

			// If elements already exists in hash map
			// Increment the count of element by 1
			else {
				hmap.put(arr[i], ++c);
			}
		}

		// Print HashMap
		System.out.println(hmap);
	}

	// Driver method to test above method
	public static void main(String[] args) {
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		createHashMap(arr);
	}

}
