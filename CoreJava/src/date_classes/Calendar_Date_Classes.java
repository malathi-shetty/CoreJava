package date_classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Date_Classes {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		//Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM)); // This returns 0 if it’s AM and 1 if it’s PM.
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		
		
		
		cal.set(2024, Calendar.SEPTEMBER, 29); // Set to January 1, 2024
		System.out.println(cal.getTime()); // Print the date
		cal.add(Calendar.DAY_OF_MONTH, 7); // Add 7 days
		System.out.println(cal.getTime()); // Print the new date
	}

}

/*
Calendar.YEAR: The year (e.g., 2023).

Calendar.MONTH: The month (0 for January, 11 for December).

Calendar.DAY_OF_MONTH: The day of the month (1 to 31).

Calendar.DAY_OF_WEEK: The day of the week (1 for Sunday, 2 for Monday, etc.).

Calendar.HOUR: Hour in 12-hour format (0-11).

Calendar.HOUR_OF_DAY: Hour in 24-hour format (0-23).

Calendar.MINUTE: The minute (0-59).

Calendar.SECOND: The second (0-59).

Calendar.AM_PM: 0 for AM, 1 for PM.

Calendar.DAY_OF_WEEK_IN_MONTH: The week of the month (1 for the first week, etc.).

*/