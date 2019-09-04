package functionalProgramming.lambdaVariableCapture;

interface Pizza6 {
	Integer bookPizza(String source, String destination); // --> By default public abstract void
}

public class LambdaParameters {

	int instanceVariable = 100;
	static int staticVariable = 5;
	
	public static void main(String[] args) {
		
	}
	
	Pizza6 p = (source, destination) -> {
		int localVariable = 90;
		System.out.println("Pizza has been booked at " + source + " and would be delivered at " + destination);
		System.out.println("Local Variable is "+ localVariable);
		System.out.println("Instance var is " + instanceVariable);
		System.out.println("Static variable is " + LambdaParameters.staticVariable);

		return 1;
	};

}
