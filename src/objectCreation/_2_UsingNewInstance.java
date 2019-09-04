package objectCreation;

public class _2_UsingNewInstance {

	/*
	 * If we know the name of the class & if it has a public default constructor we
	 * can create an object –Class.forName.
	 * 
	 * We can use it to create the Object of a Class. Class.forName actually loads
	 * the Class in Java but doesn’t create any Object.
	 * 
	 * To Create an Object of the Class you have to use the new Instance Method of
	 * the Class.
	 */

	String dummy = "Value used for Demo";

	public static void main(String[] args) {

		try {
			_2_UsingNewInstance obj = (_2_UsingNewInstance) Class.forName("objectCreation._2_UsingNewInstance")
					.newInstance();

			System.out.println(obj.dummy);

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
