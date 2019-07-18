package threading;

import java.math.BigInteger;

public class _1_StateLessImplementation {

	public static void main(String[] args) {
		
		testFactorial(5);
	}
	
	/**
	 * The testfactorial() method is a stateless deterministic function. 
	 * Given a specific input, it always produces the same output.
	 * The method neither relies on external state nor maintains state at all. 
	 * Hence, it’s considered to be thread-safe and can be safely called by multiple threads at the same time.
	 * 
	 * @param number
	 */
	
	public static void testFactorial(int number){
		
		BigInteger f = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		System.out.println(f);
	}
}
