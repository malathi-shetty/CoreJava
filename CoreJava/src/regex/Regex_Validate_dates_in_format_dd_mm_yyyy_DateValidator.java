package regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Regex_Validate_dates_in_format_dd_mm_yyyy_DateValidator {

	public static void main(String[] args) {
		  String[] testDates = {
		            "15/04/2025",  // valid
		            "31/02/2025",  // invalid (Feb has max 29 days in leap years)
		            "01/13/2024",  // invalid (13th month)
		            "29/02/2024",  // valid (leap year)
		            "3/5/2023",    // invalid format (not dd/mm/yyyy)
		            "31-12-2023"   // invalid format (slashes required)
		        };

		        for (String date : testDates) {
		            System.out.println(date + " => " + (isValidDate(date) ? "Valid" : "Invalid"));
		        }
	}     
		        public static boolean isValidDate(String dateStr) {
		            // First: Check with regex
		            String regex = "^\\d{2}/\\d{2}/\\d{4}$";
		            if (!dateStr.matches(regex)) {
		                return false;
		            }

		            // Second: Check if it's a real date
		            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		            sdf.setLenient(false); // strict mode

		            try {
		                sdf.parse(dateStr);
		                return true;
		            } catch (ParseException e) {
		                return false;
		            }
		        }

	}


/* Output:
 * 
 * 15/04/2025 => Valid
 * 
31/02/2025 => Invalid

01/13/2024 => Invalid

29/02/2024 => Valid

3/5/2023 => Invalid

31-12-2023 => Invalid

 */

/*
 * 
 * Summary:
 * 
✅ Uses regex to check format is exactly dd/mm/yyyy

✅ Uses SimpleDateFormat to validate real calendar dates

❌ Rejects things like 3/5/2023, 31-12-2023, and 32/01/2023

 */

