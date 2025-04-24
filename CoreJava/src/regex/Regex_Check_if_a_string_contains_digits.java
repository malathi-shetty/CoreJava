package regex;

public class Regex_Check_if_a_string_contains_digits {

	public static void main(String[] args) {
		String input = "My phone number is 12345";

		boolean hasDigits = input.matches(".*\\d+.*");

		System.out.println(hasDigits); // true

	}

}
