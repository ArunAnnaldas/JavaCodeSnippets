package collections.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample extends Thread{
	/**
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
	 */

	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();

	public void run() {
		// Child thread trying to
		// add new element in the
		// Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");

		// We create a child thread
		// that is going to modify
		// ArrayList l.
		CopyOnWriteArrayListExample t = new CopyOnWriteArrayListExample();
		t.run();

		Thread.sleep(1000);

		// Now we iterate through
		// the ArrayList and get
		// exception.
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}
