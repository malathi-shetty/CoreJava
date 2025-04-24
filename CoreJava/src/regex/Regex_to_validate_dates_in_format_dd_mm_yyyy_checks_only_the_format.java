package regex;

public class Regex_to_validate_dates_in_format_dd_mm_yyyy_checks_only_the_format {

	public static void main(String[] args) {
		// to validate dates in format dd/mm/yyyy
		
		String date = "15/04/2025";
		String regex = "^\\d{2}/\\d{2}/\\d{4}$";

		if (date.matches(regex)) {
		    System.out.println("Valid date format");
		} else {
		    System.out.println("Invalid date format");
		}

	}

}

//output: Valid date format

/*

Goal: We want to make sure the date is in this format: 31/12/2025

Explanation:

\\d{2} means exactly 2 digits (for day and month)

\\d{4} means exactly 4 digits (for year)

We separate them using /


NOTE: This checks only the format, not if the date is real (like Feb 30 would still pass)

*/