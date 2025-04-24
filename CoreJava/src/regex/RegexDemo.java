package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Java");

        Matcher matcher = pattern.matcher("Java is fun");


        boolean matchFound = matcher.find();

        System.out.println("Match found? " + matchFound);  // Output: Match found? true

	}

}
