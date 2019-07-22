package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * What if we want to serve the request based on the priority rather than FIFO?
 * In a practical scenario this type of solution would be preferred as it is
 * more dynamic and efficient in nature. This can be done with the help of
 * PriorityQueue, which serves the request based on the priority that we set
 * using Comparator.
 * 
 * @author janar
 *
 */

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
		queue.add("Tyrion Lannister");
		queue.add("Daenerys Targaryen");
		queue.add("Arya Stark");
		queue.add("Petyr 'Littlefinger' Baelish");

		/*
		 * What I am doing here is removing the highest priority element from Queue and
		 * displaying it. The priority I have set is based on the string length. The
		 * logic for it is written in Comparator
		 */
		while (queue.size() != 0) {
			System.out.println(queue.poll());

		}
	}

}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
	
}

