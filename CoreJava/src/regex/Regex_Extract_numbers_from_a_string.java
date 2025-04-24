package regex;

import java.util.regex.*;

public class Regex_Extract_numbers_from_a_string {

	public static void main(String[] args) {
		String input = "Order123, Invoice456";

		Pattern pattern = Pattern.compile("\\d+");

		Matcher matcher = pattern.matcher(input);


		while (matcher.find()) {

		    System.out.println("Found number: " + matcher.group());

		}

	}

}

/*Output:

Found number: 123

Found number: 456

*/
