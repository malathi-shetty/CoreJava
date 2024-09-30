package date_classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Classes {

	public static void main(String[] args) {
		//current date .. current time
		// java.util.Date; --> util is package | Date is class
		// https://www.tutorialspoint.com/java/java_date_time.htm
		
		Date d = new Date(); // comes from utility class - java.util
		System.out.println("d: " + d.toString()); // visually see the output: Sun Sep 29 11:15:49 IST 2024
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy"); 
		System.out.println("sdf: " + sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println("sd: " + sd.format(d));
		

	}

}
