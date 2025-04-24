package regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validate_dates_in_format_dd_mm_yyyy_DateValidator {

	public static void main(String[] args) {
		// to validate the date format and make sure the date is a real calendar date (so things like 30/02/2025 should fail)
		
		String[] testDates = {"29/02/2024", "31/04/2025", "15/13/2025", "01/01/2025"};

        for (String date : testDates) {
            System.out.println(date + " => " + (isValidDate(date) ? "Valid" : "Invalid"));
        }

	}

	public static boolean isValidDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Strict mode

        try {
            sdf.parse(date); // Will throw exception if date is invalid
            return true;
        } catch (ParseException e) {
            return false;
        }
	

	}

}

/* output:
 * 
 * 29/02/2024 => Valid
 * 
31/04/2025 => Invalid

15/13/2025 => Invalid

01/01/2025 => Valid


 */

/*

Proper date validation in Java (format + real date)
We'll use SimpleDateFormat to parse and validate the date.

🔑 Key idea:
SimpleDateFormat can strictly check if the date is valid.

We’ll set it to non-lenient mode to reject invalid dates like 31/02/2024.

29/02/2024 => Valid         ✅ (Leap year)

31/04/2025 => Invalid       ❌ (April has 30 days)

15/13/2025 => Invalid       ❌ (Month 13 doesn't exist)

01/01/2025 => Valid         ✅

*/