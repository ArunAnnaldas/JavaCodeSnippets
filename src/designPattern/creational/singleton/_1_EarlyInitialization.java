package designPattern.creational.singleton;

class SingletonClassExample2 {

	/*
	 * In eager initialization, the instance of Singleton Class is created at the
	 * time of class loading, this is the easiest method to create a singleton
	 * class.
	 * 
	 * By making the constructor as private we are not allowing other class to
	 * create a new instance of the class we want to create the singleton. Instead,
	 * we are creating one public static method (commonly name as for getInstance())
	 * to provide the single entry point to create the new instance of the class.
	 * 
	 * Drawback
	 * 
	 * a. Here instance is created even though client application might not be using
	 * it. This might be a considerable issue if your singleton class in creating a
	 * database connection or creating a socket.
	 * 
	 * b. This may cause the memory leak problem.
	 * 
	 * c. The solution is to create the new instance of the class, when needed.
	 * 
	 * d. This can be achieved by Lazy Initialization method.
	 * 
	 */

	private static SingletonClassExample2 instanceOfSingleClass = new SingletonClassExample2();;

	private SingletonClassExample2() {
		System.out.println("Object Created");
	}

	public static SingletonClassExample2 getInstanceOfSingleClass() {
		return instanceOfSingleClass;
	}
}

public class _1_EarlyInitialization {

	public static void main(String[] args) {
		SingletonClassExample2 object1 = SingletonClassExample2.getInstanceOfSingleClass();
		SingletonClassExample2 object2 = SingletonClassExample2.getInstanceOfSingleClass();
	}
}
