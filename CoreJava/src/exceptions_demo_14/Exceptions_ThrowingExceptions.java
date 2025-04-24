package exceptions_demo_14;

public class Exceptions_ThrowingExceptions {
	
	//You can throw exceptions manually using the throw keyword.
	

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}

	}

	public static void checkAge(int age) {
		if(age < 18)
		{
			throw new IllegalArgumentException("Age must be at least 18");
		}
		
	}

}
