package exceptions_demo_14;

public class Exceptions_CustomExceptions extends Exception {
	
	//You can create your own exceptions by extending the Exception or RuntimeException class.

	public Exceptions_CustomExceptions(String message) {
		super(message);
	}

	public static void main(String[] args) {
		try {
			throw new Exceptions_CustomExceptions("This is a custom exception");
		} catch (Exceptions_CustomExceptions e) {
			System.out.println("CustomException occurred: " + e.getMessage());
		}

	}

}
