package exceptions_demo;

public class Exceptions_Class_ArithmeticException {
	
	//This occurs when an arithmetic operation is performed that is not defined, such as division by zero.

	public static void main(String[] args) {
		// Unchecked Exceptions - This occurs when an arithmetic operation is performed
		// that is not defined, such as division by zero.
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred: " + e.getMessage());
		}
	}

}
