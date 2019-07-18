package Threading;

import java.math.BigInteger;

public class StateLessImplementation {

	public static void main(String[] args) {
		
		testFactorial(5);
	}
	
	public static void testFactorial(int number){
		
		BigInteger f = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		System.out.println(f);
	}
}
