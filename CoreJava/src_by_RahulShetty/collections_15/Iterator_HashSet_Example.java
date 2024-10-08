package collections_15;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_HashSet_Example {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA"); // dup is not accepted
		hs.add("he");
		hs.add("she");
		System.out.println("Objects present in collection: " + hs);

		Iterator<String> i = hs.iterator();
		
	//	System.out.println(i.next());
	//	System.out.println(i.next());
		
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}


//if i have 100 objects in my SET structure & if i want to print the index present on 97th, cannot write i.next() 97 times so for short we will use while loop
	//	while(i.hasNext())// i.hasNext() will check if next index is present or not before actually pointing to next index is present in set collection or not. if present then its true & then enters the loop


/*
 * How iterator can help in traversing indexes in the set interface
 * 
 * When you create a Set (like a HashSet), you can get an iterator for it using
 * the iterator() method. This iterator lets you go through each element in the
 * set one by one.
 * 
 * Create the set: For example, HashSet<String> hs = new HashSet<>();
 * 
 * Get the iterator: Use Iterator<String> i = hs.iterator();
 * 
 * Start iterating: Call i.next() to get the first element. Each time you call
 * i.next(), it moves to the next element in the set.
 * 
 * The iterator starts at the beginning of the set and lets you access each item
 * in order, making it easy to traverse the entire set.
 * 
 */