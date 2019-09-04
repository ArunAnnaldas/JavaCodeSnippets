package functionalProgramming.lambdaExpressions;

/*
 * When an interface has an exactly 1 abstract method, then it is called Functional Interface
 * 
 * */

@FunctionalInterface
interface Pizza {
	void bookPizza(); // --> by default public abstract void bookPizza();
}

class Swiggy implements Pizza {

	@Override
	public void bookPizza() {
		System.out.println("Booking pizza using Swiggy");
		
	}

}

public class _1_Polymorphism {

	public static void main(String[] args) {

		//1st way
		Pizza s = new Swiggy(); // Polymorphism
		s.bookPizza();
		
	}
}
