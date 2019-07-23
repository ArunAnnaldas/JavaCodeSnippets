package enumeration_5_butThereFromJDK_1_0;

/**
 * We should define methods as abstract methods and then we have to implement
 * defferent flavours/logic based on each enum members. Because of declaring
 * abstract method at the enum level; all of the enum members require to
 * implement the method. Basically, enum members are instances of the enum and
 * to make it instantiable, we need to implement all of abstract methods as
 * announemous class at each of the enum member
 * 
 * @author aannaldas
 *
 */

enum Operator1 {
	ADD {
		@Override
		int execute(int num1, int num2) {
			return num1 + num2;
		}
	},
	SUBTRACT {
		@Override
		int execute(final int num1, final int num2) {
			return num1 - num2;
		}
	},
	MULTIPLY {
		@Override
		int execute(final int num1, final int num2) {
			return num1 * num2;
		}
	},
	DIVIDE {
		@Override
		int execute(final int num1, final int num2) {
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Can't divide by zero.");
			}
			return 0;
		}
	};
	abstract int execute(int num1, int num2);
}

public class _5_EnumWithDefinedFunctions {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Operator1 operator = Operator1.DIVIDE;
		int result = operator.execute(num1, num2);
		System.out.println("result: " + result);
	}
}