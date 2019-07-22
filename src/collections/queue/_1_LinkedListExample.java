package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class _1_LinkedListExample {

	public static void main(String[] args) {

		/*
		 * Unbounded Queues are queues which are NOT bounded by capacity that means we
		 * should not provide the size of the queue. For example LinkedList
		 * 
		 * All Queues which are available in java.util package are Unbounded Queues and
		 * Queues which are available in java.util.concurrent package are Bounded
		 * Queues.
		 * 
		 * We cannot create instance of a Queue as it is an interface, we can create
		 * instance of LinkedList or PriorityQueue and assign it to Queue
		 * 
		 * difference between poll and remove ==> poll returns null if queue is empty
		 * ==> remove returns an error if queue is empty ==> Similarity: Both retrieves
		 * and removes the head of the queue.
		 * 
		 * diff b/w peek and element ==> peek returns null if queue is empty ==> element
		 * returns an error if queue is empty ==> Similarity: Both returns the head of
		 * the Queue
		 * 
		 */

		Queue<String> q = new LinkedList<String>();

		// Adding elements to the Queue
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");

		System.out.println("Elements in Queue:" + q);

		/*
		 * We can remove element from Queue using remove() method, this would remove the
		 * first element from the Queue
		 */
		System.out.println("Removed element: " + q.remove());

		/*
		 * element() method - this returns the head of the Queue. Head is the first
		 * element of Queue
		 */
		System.out.println("Head: " + q.element());

		/*
		 * poll() method - this removes and returns the head of the Queue. Returns null
		 * if the Queue is empty
		 */
		System.out.println("poll(): " + q.poll());

		/*
		 * peek() method - it works same as element() method, however it returns null if
		 * the Queue is empty
		 */
		System.out.println("peek(): " + q.peek());

		// Again displaying the elements of Queue
		System.out.println("Elements in Queue:" + q);
	}

	/*
	 * Methods of Queue interface
	 * 
	 * boolean add(E e): This method adds the specified element at the end of Queue.
	 * Returns true if the the element is added successfully or false if the element
	 * is not added that basically happens when the Queue is at its max capacity and
	 * cannot take any more elements.
	 * 
	 * E element(): This method returns the head (the first element) of the Queue.
	 * 
	 * boolean offer(object): This is same as add() method.
	 * 
	 * E remove(): This method removes the head(first element) of the Queue and
	 * returns its value.
	 * 
	 * E poll(): This method is almost same as remove() method. The only difference
	 * between poll() and remove() is that poll() method returns null if the Queue
	 * is empty.
	 * 
	 * E peek(): This method is almost same as element() method. The only difference
	 * between peek() and element() is that peek() method returns null if the Queue
	 * is empty.
	 * 
	 * 
	 */

}
