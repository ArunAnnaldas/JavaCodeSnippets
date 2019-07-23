package collections.iterators;

public class FailSafe_1_5 {

	/**
	 * 
	 * The other type of iterator was introduced in Java 1.5 when concurrent
	 * collection classes e.g. ConcurrentHashMap, CopyOnWriteArrayList and
	 * CopyOnWriteArraySet was introduced.
	 * 
	 * These iterator uses a view of original collection for doing iteration and
	 * that's why they doesn't throw ConcurrentModificationException even when
	 * original collection was modified after iteration has begun. This means you
	 * could iterate and work with stale value, but this is the cost you need to pay
	 * for fail-safe iterator
	 * 
	 * ======================================================================	
	 * Difference
	 * ======================================================================
	 * 
	 *
	 * 1) Fail-fast Iterator throws ConcurrentModfiicationException as soon as they
	 * detect any structural change in collection during iteration, basically which
	 * changes the modCount variable hold by Iterator. While fail-fast iterator
	 * doesn't throw CME.
	 * 
	 * 2) Fail-fast iterator traverse over original collection class while fail-safe
	 * iterator traverse over a copy or view of original collection. That's why they
	 * don't detect any change on original collection classes and this also means
	 * that you could operate with stale value.
	 * 
	 * 3) Iterators from Java 1.4 Collection classes e.g. ArrayList, HashSet and
	 * Vector are fail-fast while Iterators returned by concurrent collection
	 * classes e.g. CopyOnWriteArrayList or CopyOnWriteArraySet are fail-safe.
	 * 
	 * 4) Iterator returned by synchronized Collection are fail-fast while iterator
	 * returned by concurrent collections are fail-safe in Java.
	 * 
	 * 5) Fail fast iterator works in live data but become invalid when data is
	 * modified while fail-safe iterator are weekly consistent.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
