package exercise_9;

import java.util.HashMap;

public class Print_unique_Numbers_HashMap {

	public static void main(String[] args) {
		  // Initialize the array
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4, 1};

        // Use a HashMap to count occurrences of each number
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count occurrences of each number
        for (int number : a) {
        	 if (hm.containsKey(number)) {
                 // If the number is already in the map, increment its count
                 hm.put(number, hm.get(number) + 1);
        }  else {
            // If it's not in the map, add it with a count of 1
            hm.put(number, 1);
        }
        }

        // Print the numbers and their counts
        for (Integer key : hm.keySet()) {
            int count = hm.get(key);
            System.out.println(key + " occurs " + count + " times.");
            if (count == 1) {
                System.out.println(key + " is a unique number.");
            }
        }

	}

}
