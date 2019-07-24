package map.sortedMap.navigableMap;

import java.util.Map;
import java.util.TreeMap;

public class _3_TreeMapExample {

	/**
	 * TreeMap can be a bit handy when we only need to store unique elements in a
	 * sorted order. Java.util.TreeMap uses a red-black tree in the background which
	 * makes sure that there are no duplicates; additionally it also maintains the
	 * elements in a sorted order. TreeMap<K, V> hmap = new TreeMap<K, V>(); Below
	 * is TreeMap based implementation of same problem. This solution has more time
	 * complexity O(nLogn) compared to previous one which has O(n). The advantage of
	 * this method is, we get elements in sorted order.
	 * 
	 * 
	 * HashMap implements Map interface while TreeMap implements SortedMap
	 * interface. A Sorted Map interface is a child of Map. HashMap implements
	 * Hashing, while TreeMap implements Red-Black Tree(a Self Balancing Binary
	 * Search Tree). Therefore all differences between Hashing and Balanced Binary
	 * Search Tree apply here. Both HashMap and TreeMap have their counterparts
	 * HashSet and TreeSet. HashSet and TreeSet implement Set interface. In HashSet
	 * and TreeSet, we have only key, no value, these are mainly used to see
	 * presence/absence in a set. For above problem, we can’t use HashSet (or
	 * TreeSet) as we can’t store counts. An example problem where we would prefer
	 * HashSet (or TreeSet) over HashMap (or TreeMap) is to print all distinct
	 * elements in an array.
	 * 
	 * @param arr
	 */

	static void printFreq(int arr[]) {
		// Creates an empty TreeMap
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = tmap.get(arr[i]);

			// If this is first occurrence of element
			if (tmap.get(arr[i]) == null)
				tmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				tmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : tmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		printFreq(arr);
	}
}