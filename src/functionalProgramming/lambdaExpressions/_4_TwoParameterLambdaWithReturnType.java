package functionalProgramming.lambdaExpressions;

interface Pizza4{
	Double bookPizza(String source, String destination); // by default public abstract void 
}

public class _4_TwoParameterLambdaWithReturnType {

	public static void main(String[] args) {
		
		Pizza4 p = (source, destination)->{
			System.out.println("Pizza has been booked at " + source + 
					" and would be delivered at address " + destination);
			return 1231.23;
		};
	
		double cost = p.bookPizza("Parel", "Kharadi");
		
		System.out.println("Cost of the pizza is " + cost);
		

	}
}
