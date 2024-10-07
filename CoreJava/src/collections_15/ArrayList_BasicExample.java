package collections_15;

import java.util.ArrayList;

public class ArrayList_BasicExample {
	
	// Can accept duplicate values since it implements List Interface
	// List interface is implemented by ArrayList, Linkedlist, Vector

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Selenium");
		a.add("Java");
		a.add("Selenium"); // dup is accepted
		a.add("Java");
		System.out.println(a);
				
		a.add(0, "student");
		System.out.println(a);
		

		
		System.out.println(a.get(2));
		
	
		
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("Java"));
		
		System.out.println(a.indexOf("Selenium"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		/*		a.remove(1);
		System.out.println(a);
		
		a.remove("Java");
		System.out.println(a);
		
		a.removeAll(a);
		System.out.println(a);
*/		
	}

}


// Array have fixed size 
// ArrayList grows dynamically

//Both can access and insert any value in an any index

// Both accepts duplicate values




