package functionalProgramming.lambdaExpressions;

/*
 * When an interface has an exactly 1 abstract method, then it is called Functional Interface
 * 
 * */

@FunctionalInterface
interface Pizza3 {
	void bookPizza(); // --> by default public abstract void bookPizza();
}


public class _3_ZeroParameterLambda {

	public static void main(String[] args) {

		// 3rd way
		// Using a lambda expression --> Functional Interface

		// zero parameter lambda
		Pizza3 p = () -> {
			System.out.println("Pizza booked");
		};

		p.bookPizza();
	}
}
