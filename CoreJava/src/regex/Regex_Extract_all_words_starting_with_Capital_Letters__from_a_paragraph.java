package regex;

import java.util.regex.*;

public class Regex_Extract_all_words_starting_with_Capital_Letters__from_a_paragraph {

	public static void main(String[] args) {
		// Goal: From a sentence, get all words that start with a capital letter.

		String paragraph = "John and Mary went to New York City last Summer.";

        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            System.out.println(matcher.group());
	}

}
}

/* output:
 * 
 * John
 * Mary
 * New
 * York
 * City
 * Summer


 */

/*

Explanation:

\\b[A-Z][a-zA-Z]*\\b

\\b means word boundary

[A-Z] means it starts with a capital letter

[a-zA-Z]* means rest of the word can be any letters

*/