package regex;

import java.util.regex.*;

public class Regex_Pattern_Flags_patterns_case_insensitive {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher("I love Java");

		System.out.println(matcher.find()); // true

	}

}
