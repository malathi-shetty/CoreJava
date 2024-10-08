package exceptions_demo_14;

public class Exceptions_Class_NullPointerException {

	public static void main(String[] args) {
		// Unchecked Exceptions - This occurs when you try to access a method or
		// property of a null object.

		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred: " + e.getMessage());
		}

	}

}
