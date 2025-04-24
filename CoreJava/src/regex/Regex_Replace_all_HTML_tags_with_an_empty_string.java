package regex;

public class Regex_Replace_all_HTML_tags_with_an_empty_string {

	public static void main(String[] args) {
		// Goal: Remove tags like <div>, <p>, </a> etc. from a string.

		 String html = "<p>This is <b>bold</b> and <i>italic</i> text.</p>";
	        String clean = html.replaceAll("<[^>]+>", "");

	        System.out.println(clean);
	}

}

// output: This is bold and italic text.

/*

Explanation:

<[^>]+>

< starts a tag

[^>]+ means anything except >

> closes the tag

*/