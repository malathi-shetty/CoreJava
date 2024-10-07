package collections_15;

import java.util.HashSet;

public class HashSet_Example {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet implements Set Interface
		//Set doesnt accept duplicate values
		// there is no guarantee elements will be sorted in sequential order.. Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA"); // dup is not accepted
		System.out.println("Items present in collection: " + hs);
		
		System.out.println("" + hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

	}

}
