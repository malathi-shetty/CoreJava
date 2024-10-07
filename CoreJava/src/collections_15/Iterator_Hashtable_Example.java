package collections_15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterator_Hashtable_Example {

	public static void main(String[] args) {

		// create a hashtable & pass table to the set collections & separately closing
		// the iterator

		// Create a Hashtable and populate it with key-value pairs
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "Hello");
		ht.put(1, "GoodBye");
		ht.put(2, "Morning");
		ht.put(3, "Evening");
		ht.put(4, "");
		ht.put(5, "");
	//	ht.put(6, null);
	//	ht.put(7, null);
	//	ht.put(null, null);
	//	ht.put(null, "hi");
	//	ht.put(null, "bye");
		
		// Print the entry set of the Hashtable
		System.out.println("EntrySet: " + ht.entrySet());
		System.out.println();

		// Create a Set from the entry set of the Hashtable
		Set sn = ht.entrySet();
		Iterator it = sn.iterator();

		// Iterate through the Set using the Iterator
		while (it.hasNext()) // takes key & value pair
		{

			System.out.println("***");

			Map.Entry mp = (Map.Entry) it.next();// separate key & value using Map.Entry Class, Get the next entry
			System.out.println("Key:" + mp.getKey());
			System.out.println("Value:" + mp.getValue());
		}

	}

}

// HashTable do not allow null keys and null values in the HashTable object

//output: Exception in thread "main" java.lang.NullPointerException
//at java.base/java.util.Hashtable.put(Hashtable.java:476)
//at collections_15.Iterator_Hashtable_Example.main(Iterator_Hashtable_Example.java:24)


// The output of this code will display each key-value pair in the Hashtable.

//Remember that Hashtable is synchronized, which means it is thread-safe. If you don't need synchronization, consider using HashMap for better performance.

//Always ensure you handle potential NullPointerExceptions when working with collections, especially when modifying the code to add or remove elements.