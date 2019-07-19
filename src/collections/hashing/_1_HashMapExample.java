package collections.hashing;

import java.util.HashMap;

public class _1_HashMapExample {

	/**
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
