package threading;

public class _2_ImmutableImplementation {

	private final String message;

	/**
	 * If we need to share state between different threads, we can create
	 * thread-safe classes by making them immutable. To put it simply, a class
	 * instance is immutable when its internal state can’t be modified after it has
	 * been constructed. The easiest way to create an immutable class in Java is by
	 * declaring all the fields private and final and not providing setters:
	 * 
	 */
	public _2_ImmutableImplementation(String message) {
		this.message = message;
	}

}
