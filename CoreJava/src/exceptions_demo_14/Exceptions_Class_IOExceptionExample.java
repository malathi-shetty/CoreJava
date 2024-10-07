package exceptions_demo_14;

import java.io.FileReader;
import java.io.IOException;

public class Exceptions_Class_IOExceptionExample {
	// Checked Exceptions - This exception occurs during input/output operations.

	public static void main(String[] args) {
		 try {
	            FileReader fr = new FileReader("nonexistentfile.txt");
	        } catch (IOException e) {
	            System.out.println("IOException occurred: " + e.getMessage());
	        }

	}

}
