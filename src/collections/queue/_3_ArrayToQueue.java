package collections.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _3_ArrayToQueue {
	public static void main(String[] args) {

		String nums[] = { "one", "two", "three", "four", "five" };
		Queue<String> queue = new LinkedList<>();
		Collections.addAll(queue, nums);
		System.out.println(queue);
	}
}
