package designPattern.creational.singleton;

class SingletonClassExample {

	/*
	 * Lazy Initialization This method will check if there is any instance of that
	 * class is already created? If yes, then our method (getInstance()) will return
	 * that old instance and if not then it creates a new instance of the singleton
	 * class in JVM and returns that instance. This approach is called as Lazy
	 * initialization.
	 * 
	 * When we develop a class in such a way that it can have only 1 instance at any
	 * time, is called Singleton design pattern. It is very useful when you need to
	 * use same object of a class across all classes or framework. Singleton class
	 * must return the same instance again, if it is instantiated again.
	 * 
	 * To create a singleton class, we need to do following steps:
	 * 
	 * a. Declare constructor of class as private so that no one instantiate class
	 * outside of it.
	 * 
	 * b. Declare a static reference variable of class. Static is needed to make it
	 * available globally.
	 * 
	 * c. Declare a static method with return type as object of class which should
	 * check if class is already instantiated once.
	 */

	private static SingletonClassExample instanceOfSingleClass;

	private SingletonClassExample() {
		System.out.println("Object Created");
	}

	public static SingletonClassExample getInstanceOfSingleClass() {
		if (instanceOfSingleClass == null) {
			instanceOfSingleClass = new SingletonClassExample();
		} else {
			System.out.println("Object already created");
		}
		return instanceOfSingleClass;
	}

}

public class _2_LazyInitialization {

	public static void main(String[] args) {
		SingletonClassExample object1 = SingletonClassExample.getInstanceOfSingleClass();
		SingletonClassExample object2 = SingletonClassExample.getInstanceOfSingleClass();

		/*
		 * In Java if the two objects are same then, their hash key have to be equal.
		 * Let’s test that. If the above singleton is correctly implemented then below
		 * code should return the same hash key.
		 */
		System.out.println("Instance 1 hash:" + object1.hashCode());
		System.out.println("Instance 2 hash:" + object2.hashCode());

	}
}
