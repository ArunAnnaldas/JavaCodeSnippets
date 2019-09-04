package functionalProgramming.lambdaExpressions;

/*
 * When an interface has an exactly 1 abstract method, then it is called Functional Interface
 * 
 * */

@FunctionalInterface
interface Pizza2 {
	void bookPizza(); // --> by default public abstract void bookPizza();
}


public class _2_AnonymousInnerClass {

	public static void main(String[] args) {

		// 2nd way
		//Anonymous Inner class
		Pizza2 p = new Pizza2() {

			@Override
			public void bookPizza() {
				System.out.println("Pizza booked using Swiggy");

			}
		};

		p.bookPizza();
	}
}

