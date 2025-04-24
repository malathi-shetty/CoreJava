package string_2;

public class Strings_Are_immutable_3 {

	public static void main(String[] args) {
		// 
		
		String a ="hello"; // string literal
		String b="hello"; // another object is not created since it will check in memory already hello is created & point to the hello object
		
		a.concat(" World"); 
		System.out.println(a);// cannot change original content so it wont be hello world it would be hello only
		
		// if we concat original content of a then it would be problem for string b since its refer to original content of a 
		// so to avoid the problem we cannot change the original content of a
		// if we give some other object reefer like c it will get change for reference c
		
		String c = a.concat(" World");
		System.out.println(c);
		
		String s = new String("Hello"); // String class by creating object
		String s1 = new String("Hello");//no matter already object is created in s it will still forcefully create 1 more object in memory for s1
		// String class creates new object every time in memory
		
		
		// immutable means cannot be altered or changed - constant
		
		//.equals - blindly compare
		
		System.out.println(a.equals(b)); // compare content - true
		System.out.println(a==b); // reference comparison - both are refering to same object - true
		
		System.out.println(a.equals(s)); // true
		System.out.println(a==s);// object reference are different - false
		
		System.out.println(a.equals(c)); // - false
		System.out.println(a==c);  //- false
		
		System.out.println(s.equals(s1)); // - true - content is same
		System.out.println(s==s1);  //- false - references are different as they are defined with string class
		
		
		System.out.println(a.equalsIgnoreCase(s));//ignore cases
		
		
	}

}
