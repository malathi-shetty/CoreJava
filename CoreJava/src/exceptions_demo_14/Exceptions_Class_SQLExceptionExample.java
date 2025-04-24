package exceptions_demo_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptions_Class_SQLExceptionExample {

	public static void main(String[] args) {
		//Checked Exceptions - This exception occurs when there is a database access error.
		
		   try {
	            Connection conn = DriverManager.getConnection("jdbc:invalidurl", "user", "password");
	        } catch (SQLException e) {
	            System.out.println("SQLException occurred: " + e.getMessage());
	        }
	}

}
