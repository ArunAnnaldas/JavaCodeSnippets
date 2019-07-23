package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQueueExample {
	/**
	 * When to use ArrayList and when to use ArrayDeque? ArrayDeque has the ability
	 * to add or remove the elements from both ends (head or tail), on the other
	 * hand removing last element from ArrayList takes O(n) time as it traverses the
	 * whole list to reach the end. So if you want to add or remove elements from
	 * both ends choose ArrayDeque over ArrayList, however if you only want to
	 * perform the opreation on the tail (at the end) then you should choose
	 * ArrayList.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * We cannot create instance of a Deque as it is an interface, we can create
		 * instance of ArrayDeque or LinkedList and assign it to Deque
		 */
		Deque<String> dq = new ArrayDeque<String>();

		/*
		 * Adding elements to the Deque. addFirst() adds element at the beginning and
		 * addLast() method adds at the end.
		 */
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");

		System.out.println("Elements in Deque:" + dq);

		/*
		 * We can remove element from Deque using remove() method, we can use normal
		 * remove() method which removes first element or we can use removeFirst() and
		 * removeLast() methods to remove first and last element respectively.
		 */
		System.out.println("Removed last element: " + dq.removeLast());

		/*
		 * element() method - returns the head of the Deque. Head is the first element
		 * of Deque
		 */
		System.out.println("Head: " + dq.element());

		/*
		 * pollLast() method - this method removes and returns the tail of the
		 * Deque(last element). Returns null if the Deque is empty. We can also use
		 * poll() or pollFirst() to remove the first element of Deque.
		 */
		System.out.println("pollLast(): " + dq.pollLast());

		/*
		 * peek() method - it works same as element() method, however it returns null if
		 * the Deque is empty. We can also use peekFirst() and peekLast() to retrieve
		 * first and last element
		 */
		System.out.println("peek(): " + dq.peek());

		// Again printing the elements of Deque
		System.out.println("Elements in Deque:" + dq);
	}

}
