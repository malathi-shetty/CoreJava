package streams_LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;

public class Test1_Streams {

	public static void main(String[] args) {

		// ====================
		// Stream Collect Example
		// ====================
		// Collect names that end with 'a', convert them to uppercase, and store in a
		// list
		List<String> ls = Stream
				.of("Aisha", "Diana", "Abhijeet", "Alekhya", "Rama", "Adam", "Rudransh", "Arnav", "Hridyansh")
				.filter(s -> s.endsWith("a")) // Filter names ending with 'a'
				.map(s -> s.toUpperCase()) // Convert names to uppercase
				.collect(Collectors.toList()); // Collect results in a list
		System.out.println("Get 1st names from index 0: " + ls.get(0)); // Output first name
		System.out.println();

		// ====================
		// Stream Map Example
		// ====================
		// Filter names starting with 'n', sort them, convert to uppercase, and print
		List<String> names1 = Arrays.asList("Aisha", "Arnav", "Hridyansh", "naman", "Shyna", "neher");

		names1.stream().filter(s -> s.startsWith("n")) // Filter names starting with 'n'
				.sorted() // Sort the names
				.map(String::toUpperCase) // Convert names to uppercase
				.forEach(s -> System.out.println("First Letter 'n': " + s)); // Print each name

		System.out.println();

		// ====================
		// Merging Two Lists Example
		// ====================
		// Merge two lists, remove duplicates, sort the results, and print
		List<String> names2 = Arrays.asList("aman", "Shyna", "neher");

		Set<String> mergedSet = Stream.concat(names2.stream(), names1.stream()) // Merge two streams
				.collect(Collectors.toSet()); // Collect into a Set to remove duplicates

		mergedSet.stream().sorted() // Sort the merged set
				.forEach(m -> System.out.println("Merged and sorted list (no duplicates): " + m)); // Print each name

		System.out.println();

		// ====================
		// Check for Element Example
		// ====================
		// Check if "Ad77am" exists in the merged list of names
		List<String> names3 = Arrays.asList("Alice", "Bob", "Adam");
		List<String> names4 = Arrays.asList("Charlie", "David", "Bob", "Ad77am");

		Stream<String> newStream = Stream.concat(names4.stream(), names3.stream()); // Merge the two name lists
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Ad77am")); // Check if "Ad77am" is present

		System.out.println("Is Ad77am Present on the List: " + flag); // Print the result
		Assert.assertTrue(flag); // This will pass the assertion if true

		System.out.println();

		// print unique number
		List<Integer> num = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		System.out.print("Unique numbers: ");
		num.stream().distinct().forEach(s -> System.out.print(s + " "));
		System.out.println(); // For a new line

		// Sort the unique numbers and find the number at index 2

		List<Integer> sortedUniqueNumbers = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("sortedUniqueNumbers: " + sortedUniqueNumbers);
		// Get the element at the 3rd index (which is the 3rd unique number)
		System.out.println("3rd index element: " + sortedUniqueNumbers.get(2));

	}

}

/*
 * 
 * distinct(): This method filters the stream to remove duplicate elements.
 * 
 * sorted(): This method sorts the elements in natural order.
 * 
 * forEach(): This method iterates over the elements and prints each one.
 * 
 */