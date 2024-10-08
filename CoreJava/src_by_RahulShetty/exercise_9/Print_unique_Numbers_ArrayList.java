
package exercise_9;

import java.util.ArrayList;

public class Print_unique_Numbers_ArrayList {

	public static void main(String[] args) {

		// Algorithm: Empty ArrayList: unique number arrayList =4, if duplicate found
		// increase arrayList; once done with 4 check another for loop for next number &  so on
	
		// Output expected: 4 --> 3 times; 5 --> 3 times; 6 --> 2 times; 9 --> 1 times

		// Print unique Number from the list
		
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 ,1 };

		// Empty ArrayList: unique number arrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			
			 // Check if the number is already added to the unique list
			if (!al.contains(a[i])) 
			{
				al.add(a[i]); // Add the number to unique list
				k++;

				for (int j = i + 1; j < a.length; j++) { // Use j to count all occurrences
					if (a[i] == a[j]) {
						k++;

					}
				}
				
				 // Print the number and its count
                System.out.println(a[i] + " occurs " + k + " times.");
			
                
                // Check if the count is 1 (indicating it's unique)
				if (k == 1) {
					System.out.println(a[i] + " is a unique number");
				}
			}

		}

	}

}
