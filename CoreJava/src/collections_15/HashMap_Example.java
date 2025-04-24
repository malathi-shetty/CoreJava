package collections_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		// HashMap is in key-value form
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		
		System.out.println("Value in hm: " + hm);
		
		System.out.println("Value at index 2: " + hm.get(2));
		System.out.println("Value at index 42: " + hm.get(42));
		
		System.out.println("Remove Key-Value at index 1: " + hm.remove(1));
		System.out.println("Value at index 1: " + hm.get(1));
		
		System.out.println("Value in hm: " + hm);
		
		System.out.println();
		System.out.println("**Using String, String**");
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("hi", "Hello");
		hm1.put("bye", "GoodBye");
		System.out.println(hm1.get("hi"));
		
		
	}

}
