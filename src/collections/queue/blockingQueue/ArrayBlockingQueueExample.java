package collections.queue.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Bounded Queues are queues which are bounded by capacity that means we need to
 * provide the max size of the queue at the time of creation. For example
 * ArrayBlockingQueue
 * 
 * All Queues which are available in java.util package are Unbounded Queues and
 * Queues which are available in java.util.concurrent package are Bounded
 * Queues.
 * 
 * @author janar
 *
 */

public class ArrayBlockingQueueExample {
	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.add("one"));
		System.out.println(queue.add("two"));
		System.out.println(queue);
		System.out.println(queue.offer("three"));
		System.out.println(queue);
	}
}
