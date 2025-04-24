package brushUp1;

public class CoreJavaBrushUp5 {

	public static void main(String[] args) {
		// String is an object that represents sequence of characters or array of
		// characters

		// how many ways u can define String?
		// 1. String literal
		// 2. Using new operator

		// String Literal: - String object s1 & s2 will have same memory allocation
		// since s is already existing, s1 too will point it to it since both values are
		// same if values are different then new object is created
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		String s5 = "hello";

		// Using new Keyword: go & create a space in my java memory by using "new"
		// keyword
		// even if same value it will create new memory allocation
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");

		// if u want to access method of the class u create object of the string
		// split method: if i want to remove white spaces between characters
		String s4 = "Rahul Shetty Academy";
		String[] splittedString = s4.split(" ");
		System.out.println(s4);
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);

		String[] splittedString1 = s4.split("Shetty");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		System.out.println(splittedString1[1].trim());

		for (int i = 0; i < s4.length(); i++) {
			System.out.println(s4.charAt(i));
		}
		
		System.out.println("*********");
		
		// print string in reverse order

		for (int i = s4.length() - 1; i >= 0; i--) {
			System.out.println(s4.charAt(i));
		}
	}

}
