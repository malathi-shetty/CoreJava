package string_2;

public class StringClass_1 {

	public static void main(String[] args) {
		// String is one of the prebuilt class in java
		
		// how many ways u can define a string
		//1. String literal
		//2. By creating object of string
		
		String a ="hello"; // String literal
		// String is created "hello" & stored in a variable a. 
		
		
		
		String b ="hello"; // checks in string pool whether hello is created before
		//if its created then it refers to same object rather than creating new object
		
		
		String ab = new String("hello"); // create String object & string manipulations can be done in hello string - string class - it is done in backend
		
		String bc = new String("hello"); // even if hello is created in object ab; bc will force to create an another object hello
		
		
		
	}

}
