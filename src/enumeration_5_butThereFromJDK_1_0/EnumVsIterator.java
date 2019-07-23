package enumeration_5_butThereFromJDK_1_0;

public class EnumVsIterator {

	/**
	 * 
	 * 
	 * URL :
	 * https://javarevisited.blogspot.com/2010/10/what-is-difference-between-enumeration.html#axzz5uWuCkqBy
	 * 
	 * Iterator also allows you to remove elements from collection during traversal
	 * Enumeration doesn't allow that , it doesn't got the remove() method.
	 * 
	 * Vector supports Enumeration but ArrayList doesn't.
	 * 
	 * Iterator is more secure and safe as compared to Enumeration because it does
	 * not allow other thread to modify the collection object while some thread is
	 * iterating over it and throws ConcurrentModificationException.
	 * 
	 * In Summary both Enumeration and Iterator will give successive elements, but
	 * Iterator is new and improved version where method names are shorter, and has
	 * new method called remove. Here is a short comparison:
	 * 
	 * 
	 * 
	 */

}
