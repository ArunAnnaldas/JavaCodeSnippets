package collections.list.arrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

class _2_CopyOnWriteArrayListExample extends Thread {
	/**
	 * 
	 * CopyOnWriteArrayList: CopyOnWriteArrayList class is introduced in JDK 1.5,
	 * which implements List interface. It is enhanced version of ArrayList in which
	 * all modifications (add, set, remove, etc) are implemented by making a fresh
	 * copy.
	 * 
	 * As the name indicates, CopyOnWriteArrayList creates a Cloned copy of
	 * underlying ArrayList, for every update operation at certain point both will
	 * be synchronized automatically ,which is taken care by JVM. Therefore there is
	 * no effect for threads which are performing read operation.
	 * 
	 * It is costly to use because for every update operation a cloned copy will be
	 * created. Hence CopyOnWriteArrayList is the best choice if our frequent
	 * operation is read operation.
	 * 
	 * It extends object and implements Serializable, Cloneable, Iterable<E>,
	 * Collection<E>, List<E> and RandomAccess
	 * 
	 * The main important point about CopyOnWriteArrayList is Iterator of
	 * CopyOnWriteArrayList can not perform remove operation otherwise we get
	 * Run-time exception saying UnsupportedOperationException.
	 */

	// creating ArrayList of type String
	static ArrayList<String> alStars = new ArrayList<String>();

	@Override
	public void run() {

		try {
			// sleeping thread for 1000 ms
			Thread.sleep(1000);

			// removing element at 2nd position
			String star = alStars.remove(1);
			System.out.println("Thread 2: removed " + star);
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
		System.out.println("Removal is done... !!");
	}

	/**
	 * main() method
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// adding elements to ArrayList
		alStars.add("Rock Star");
		alStars.add("Ultimate Star");
		alStars.add("Little Star");

		// creating another thread
		Thread newThread = new Thread(new _2_CopyOnWriteArrayListExample());
		newThread.start();

		// iterating ArrayList using enhanced for-loop
		for (String star : alStars) {

			System.out.println("Thread 1 iterating : " + star);

			// sleeping thread for 1500 ms, after every turn
			Thread.sleep(1500);
		}
		System.out.println("Iterating AL completed... !!");
	}

	/*
	 * Main thread iterating ArrayList and child thread removing element at 2nd
	 * position (index-1) of same ArrayList object.
	 * 
	 * From output, it is clear that while one thread is iterating on ArrayList and
	 * if any other thread perform modify operation (i.e.; on the same ArrayList
	 * object, other thread is removing an element) Then compiler will throw
	 * ConcurrentModificationException i.e.; it is fail-fast iterator
	 * 
	 * Note: sleep(ms) introduced to study demo example Because without sleep both
	 * thread will execute independently and complete its execution in nano/pico
	 * seconds and there won’t be any compile-time error.
	 * 
	 * Since we are trying to understand with small amount of data, where execution
	 * completes in nano seconds But with large set of data, introduction of sleep
	 * concept isn’t required As execution time increases for each thread,
	 * definitely ConcurrentModificationException is thrown
	 */
}

class IterateAndModifyCopyOnWriteArrayListSimultaneously implements Runnable {

	// creating CopyOnWriteArrayList of type String
	static CopyOnWriteArrayList<String> cowalStars = new CopyOnWriteArrayList<String>();

	@Override
	public void run() {

		try {
			// sleeping thread for 1000 ms
			Thread.sleep(1000);

			// removing element at 2nd position
			String star = cowalStars.remove(1);
			System.out.println("Thread 2: removed " + star);
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
		System.out.println("Removal is done... !!");
	}

	/**
	 * main() method
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// adding elements to CopyOnWriteArrayList
		cowalStars.add("Rock Star");
		cowalStars.add("Ultimate Star");
		cowalStars.add("Little Star");

		// creating another thread
		Thread newThread = new Thread(new IterateAndModifyCopyOnWriteArrayListSimultaneously());
		newThread.start();

		// iterating CopyOnWriteArrayList using enhanced for-loop
		for (String star : cowalStars) {

			System.out.println("Thread 1 iterating : " + star);

			// sleeping thread for 1500 ms, after every turn
			Thread.sleep(1500);
		}
		System.out.println("Iterating COWAL completed... !!");
	}
}
