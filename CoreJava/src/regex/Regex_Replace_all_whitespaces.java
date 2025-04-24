package regex;

public class Regex_Replace_all_whitespaces {

	public static void main(String[] args) {
		String messy = "Java   is \t awesome!";

		String cleaned = messy.replaceAll("\\s+", " ");

		System.out.println(cleaned); // Java is awesome!

	}

}
