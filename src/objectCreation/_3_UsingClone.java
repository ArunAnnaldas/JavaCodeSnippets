package objectCreation;

public class _3_UsingClone implements Cloneable{

	/*
	 * Whenever clone() is called on any object, the JVM actually creates a new
	 * object and copies all content of the previous object into it. Creating an
	 * object using the clone method does not invoke any constructor. To use clone()
	 * method on an object we need to implement Cloneable and define the clone()
	 * method in it.
	 */

	String dummy = "Value used for Demo";

	public static void main(String[] args) throws CloneNotSupportedException {

		_3_UsingClone obj = new _3_UsingClone();
		obj.dummy="Updated value by Object 1";
		
		
		_3_UsingClone obj2 = (_3_UsingClone) obj.clone();
		//obj2.dummy = "Updated value by Object 2";
		
		System.out.println(obj.dummy);
		System.out.println(obj2.dummy);
		
		
		
	}
}
