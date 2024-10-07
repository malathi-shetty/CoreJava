package exceptions_demo_14;

public class Exceptions_Class_ArrayIndexOutOfBoundsException {

	// one try block can be followed by multiple catch blocks
	// catch should always be immediately followed after try block

	// Unchecked Exceptions - ArrayIndexOutOfBoundsException - This occurs when you
	// try to access an array with an invalid index.

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };
		try {

			System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception occurred: " + e.getMessage());
		}

	}

}
