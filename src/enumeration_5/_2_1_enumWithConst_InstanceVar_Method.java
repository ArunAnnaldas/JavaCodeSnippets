package enumeration_5;

/**
 * In this example as soon as we declare an enum variable(Student S), the
 * constructor is called once, and it initializes age for every enumeration
 * constant with values specified with them in parenthesis.
 * 
 * @author aannaldas
 *
 */

enum Student {
	John(11), Bella(10), Sam(13), Viraaj(9);
	private int age; // variable defined in enum Student

	int getage() {
		return age;
	}; // method defined in enum Student

	Student(int age) // constructor defined in enum Student
	{
		this.age = age;
	}
}

public class _2_1_enumWithConst_InstanceVar_Method {
	public static void main(String args[]) {
		Student S;
		System.out.println("Age of Viraaj is " + Student.Viraaj.getage() + " years");
	}
}