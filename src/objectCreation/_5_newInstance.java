package objectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class _5_newInstance {

	/*
	 * This is similar to the newInstance() method of a class.
	 * 
	 * There is one newInstance() method in the java.lang.reflect.Constructor class
	 * which we can use to create objects. It can also call parameterized
	 * constructor, and private constructor by using this newInstance() method.
	 * 
	 * Both newInstance() methods are known as reflective ways to create objects. In
	 * fact newInstance() method of Class internally uses newInstance() method of
	 * Constructor class.
	 */

	String dummy="";
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<_5_newInstance> newObject = _5_newInstance.class.getDeclaredConstructor();
		
		_5_newInstance constObject= newObject.newInstance();
		
		constObject.dummy="Updating this value after creating object using newInstance method of Constructor class";
		
		System.out.println(constObject.dummy);
		
		
	}
}
