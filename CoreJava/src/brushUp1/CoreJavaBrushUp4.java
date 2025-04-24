package brushUp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// each package has 100s of classes

public class CoreJavaBrushUp4 {

	public static void main(String[] args) {

		// create object of the class with new operator : object.method
		// new operator will allocate memory
		ArrayList<String> a = new ArrayList<String>(); // ArrayList is a class
		// object 'a' is created to access the method in the class ArrayList
		// ArrayList<String> - ArrayList will store only string values
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");

		System.out.println("List in a: " + a);
		System.out.println();

		System.out.println("3rd value in the List: " + a.get(3));
		System.out.println();

		a.remove(2);
		System.out.println("Remove 2nd value in the List: " + a);
		System.out.println();

		System.out.println("For loop - List in a: ");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println();
		System.out.println("Enhanced for loop - List in a: ");
		for (String val : a) // enhanced for loop
		{
			System.out.println(val);
		}
		System.out.println();
		// item is present in Arraylist
		System.out.println(a.contains("selenium")); // boolean value

		System.out.println();
		// traditional array is converted into ArrayList or List using
		// Arrays.asList(name) & then contains method is used instead of for loop
		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameList = Arrays.asList(name);
		System.out.println(nameList.contains("java"));
	}

}
