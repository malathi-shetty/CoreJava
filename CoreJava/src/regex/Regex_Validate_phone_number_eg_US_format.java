package regex;

public class Regex_Validate_phone_number_eg_US_format {

	public static void main(String[] args) {
		String phone = "123-456-7890";

		boolean isValid = phone.matches("\\d{3}-\\d{3}-\\d{4}");

		System.out.println(isValid); // true

	}

}
