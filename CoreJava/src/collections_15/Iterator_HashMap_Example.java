package collections_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterator_HashMap_Example {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		hm.put(4, "");
		hm.put(5, "");
		hm.put(6, null);
		hm.put(7, null);
		hm.put(null, null);
		hm.put(null, "hi");
		hm.put(null, "bye");

		
		System.out.println("EntrySet: " + hm.entrySet());
		System.out.println();
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext()) // takes key & value pair
		{
			
		//	System.out.println(it.next()); // checking hashset way not able to seprate key & value
			System.out.println("***");
			Map.Entry mp = (Map.Entry)it.next();//separate key & value using Map.Entry Class
			System.out.println("Key:" + mp.getKey());
			System.out.println("Value:" + mp.getValue());
		}
		

	}

}

// HashMap allows one null key & any number of null values