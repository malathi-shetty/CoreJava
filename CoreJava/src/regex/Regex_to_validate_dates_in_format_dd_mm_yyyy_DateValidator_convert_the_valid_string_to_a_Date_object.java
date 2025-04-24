package regex;


import java.text.*;
import java.util.*;

public class Regex_to_validate_dates_in_format_dd_mm_yyyy_DateValidator_convert_the_valid_string_to_a_Date_object {

	 
		// Main method
		    public static void main(String[] args) {
		        String[] testDates = {
		            "15/04/2025", "31/02/2025", "01/13/2024",
		            "29/02/2024", "3/5/2023", "31-12-2023"
		        };

		        // This one includes time
		        String inputWithTime = "15/04/2025 12:30";
		        SimpleDateFormat sdfWithTime = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		        try {
		            Date dateWithTime = sdfWithTime.parse(inputWithTime);
		            System.out.println("Parsed with time: " + inputWithTime + " => " + dateWithTime);
		        } catch (ParseException e) {
		            System.out.println("Failed to parse input with time.");
		        }

		        System.out.println("\nDate Validation Results:");
		        for (String dateStr : testDates) {
		            Date date = parseDate(dateStr);
		            if (date != null) {
		                System.out.println(dateStr + " => Valid ✅ (Date object: " + date + ")");
		            } else {
		                System.out.println(dateStr + " => Invalid ❌");
		            }
		        }
		    }

		    // Validate and convert to Date object
		    public static Date parseDate(String dateStr) {
		        // 1. Format check using regex
		        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
		        if (!dateStr.matches(regex)) {
		            return null;
		        }

		        // 2. Strict parsing to ensure real date
		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        sdf.setLenient(false);

		        try {
		            return sdf.parse(dateStr);  // returns a Date object with time set to 00:00:00
		        } catch (ParseException e) {
		            return null;
		        }
		    }
		}



/* output:
 * 
 * Parsed with time: 15/04/2025 12:30 => Tue Apr 15 12:30:00 IST 2025

Date Validation Results:

 * 15/04/2025 => Valid ✅ (Date object: Tue Apr 15 00:00:00 IST 2025)
 * 
31/02/2025 => Invalid ❌

01/13/2024 => Invalid ❌

29/02/2024 => Valid ✅ (Date object: Thu Feb 29 00:00:00 IST 2024)

3/5/2023 => Invalid ❌

31-12-2023 => Invalid ❌


*/

/*
 * 
 * Return Date object if valid

Instead of returning true/false, we’ll return a Date object if the input is valid.

If it’s invalid, return null.

********

00:00:00 you're seeing in the Date object means the time part of the date is midnight (i.e. the very start of the day).

🔍 Here's why:
When you parse a date string like "15/04/2025" with SimpleDateFormat, you only provide the date, not the time. So Java automatically sets the time to:


00:00:00.000 (midnight)

This is totally normal. The Date object stores both date and time, even if you only gave it a date.

**********
*
*✅ parseDate() validates dd/MM/yyyy and returns a real Date object.

✅ You can parse a separate string with time using another formatter.

✅ Time defaults to 00:00:00 if not given.

❌ sdf1 (the formatter with time) must be defined outside parseDate() if you want to use it in main().

*/
