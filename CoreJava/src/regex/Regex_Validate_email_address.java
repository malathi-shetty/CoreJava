package regex;

public class Regex_Validate_email_address {

	public static void main(String[] args) {
		String email = "test@example.com";

		boolean isValid = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

		System.out.println(isValid); // true

	}

}
